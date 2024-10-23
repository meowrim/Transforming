class Rect(var x: Int, var y: Int, val width: Int, val height: Int) : Movable, Figure(0), Transforming {
    var color: Int = -1

    lateinit var name: String
    
    constructor(rect: Rect) : this(rect.x, rect.y, rect.width, rect.height)

    override fun move(dx: Int, dy: Int) {
        x += dx
        y += dy
    }

    override fun area(): Float {
        return (width * height).toFloat()
    }

    override fun resize(zoom: Int) {
        val scaleFactor = zoom / 100.0
        val newWidth = (width * scaleFactor).toInt()
        val newHeight = (height * scaleFactor).toInt()

        println("Resizing rectangle from width: $width, height: $height to new width: $newWidth, new height: $newHeight")
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {

        val offsetX = x - centerX
        val offsetY = y - centerY
        
        when (direction) {
            RotateDirection.Clockwise -> {
                x = centerX - offsetY
                y = centerY + offsetX
            }
            RotateDirection.CounterClockwise -> {
                x = centerX + offsetY
                y = centerY - offsetX
            }
        }
        println("Rotated rectangle to new position: ($x, $y)")
    }
}
