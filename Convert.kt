import java.util.*

fun main() {
    val inputer = Scanner(System.`in`)

    println("Please enter the value you want to convert:")
    val input = inputer.nextDouble()

    println("Please enter the current unit of value you just input:")
    val valueUnit = inputer.next()

    println("Please enter the unit of measurement to convert to the value to:")
    val convetionUnit = inputer.next()

    val answer = makeConversion(input, valueUnit, convetionUnit)
    println("This is the result: $answer")
}

fun makeConversion(input: Double, valueUnit: String, convetionUnit: String): Double {
    return when (valueUnit.toLowerCase() to convetionUnit.toLowerCase()) {
        "km" to "mi" -> input * 0.62
        "mi" to "km" -> input * 1.61
        "cm" to "in" -> input * 0.39
        "in" to "cm" -> input * 2.54
        "kg" to "lb" -> input * 2.2
        "lb" to "kg" -> input * 0.4
        else -> input 
    }
}
