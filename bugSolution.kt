```kotlin
fun calculateArea(length: Double, width: Double): Double {
    require(length >= 0 && width >= 0) { "Length and width must be non-negative" }
    return length * width
}

fun main() {
    println("Enter length:")
    val lengthInput = readLine()
    println("Enter width:")
    val widthInput = readLine()

    val length = lengthInput?.toDoubleOrNull() ?: run {
        println("Invalid length input. Please enter a number.")
        return
    }
    val width = widthInput?.toDoubleOrNull() ?: run {
        println("Invalid width input. Please enter a number.")
        return
    }

    try {
        val area = calculateArea(length, width)
        println("Area: $area")
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}
```