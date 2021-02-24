package `in`.obvious.ws.writingkotlin

class Shape() {
    fun circle() = println("this is a circle")
    fun triangle() = println("triangle")
}

fun Shape.getRadius(radius: Int) = println("Shape radius: $radius")

private fun main() {
    Shape().apply {
        circle()
        triangle()
        getRadius(10)
    }
}