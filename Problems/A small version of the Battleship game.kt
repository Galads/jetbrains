import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`).nextLine().split(" ").map { it.toInt() }.toIntArray()
    var sumX = ""
    var sumY = ""
    var addX = ""
    var addY = ""

    for ((j, i) in input.withIndex()) {
        if (j % 2 != 0) {
            sumY += i
            continue
        }
        sumX += i
    }

    for (i in 1..5) {
        if (!sumX.any { it.toString().toInt() == i }) { addX += "$i " }
        if (!sumY.any { it.toString().toInt() == i }) { addY += "$i " }
    }
    println(addX.trim(' '))
    println(addY.trim(' '))
}