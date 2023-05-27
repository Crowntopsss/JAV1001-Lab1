// Temitope Adebiyi
// A00277043
// A simple function to convert between different forms of measurements

import java.util.*

fun main() {
    val inputer = Scanner(System.`in`)

    println(""""
    Here are the list of conversion you can do
    km to mi
    mi to km
    cm to km
    in to cm
    kg to lb
    lb to kg
    70""")

    println("Please enter the value you want to convert:")
    val input = inputer.nextDouble()

    println("Please enter the current unit of value you just input:")
    val valueUnit = inputer.next()

    println("Please enter the unit of measurement to convert to the value to:")
    val convetionUnit = inputer.next()

    // the function for the conversion is called below
    val answer = makeConversion(input, valueUnit, convetionUnit)
    // A check is done here to see if the answer is null
    if (answer != null) {
         println("This is the result: $answer")
    } else {
        println("Conversion metric not found for the given units.")
    }
}

fun makeConversion(input: Double, valueUnit: String, convetionUnit: String): Double? {
    return when (valueUnit.toLowerCase() to convetionUnit.toLowerCase()) {
        "km" to "mi" -> input * 0.62
        "mi" to "km" -> input * 1.61
        "cm" to "in" -> input * 0.39
        "in" to "cm" -> input * 2.54
        "kg" to "lb" -> input * 2.2
        "lb" to "kg" -> input * 0.4
        else -> null 
    }
}
