interface Transforming {
    fun resize(zoom: Int)
    // Увеличивает фигуру

    fun rotate(direction: RotateDirection, centerX: Int, centerY: Int)
    // Поворот фигуры вокруг точки (centerX, centerY) на 90 градусов
}

enum class RotateDirection {
    // Направление вращения фигуры на 90 градусов
    Clockwise, CounterClockwise
}
