import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val arrNum = IntArray(scanner.nextInt()) { scanner.nextInt() }
    for (i in rotate(arrNum, scanner.nextInt()))
        print("$i ")
}

private fun rotate(array: IntArray, distance: Int): IntArray {
    val copyArr = array.copyOf()

    array.forEachIndexed { index, value ->
        val newIndex = (index + distance) % array.size
// test       println("index $index; value $value; newIndex $newIndex;")
        copyArr[newIndex] = value
    }
// test    println(copyArr.toList())
    return copyArr
}
// example
// newIndex = (0 + (5 - 3 )) % 5
// newIndex = (1 + (5 - 3 )) % 5
// newIndex = (2 + (5 - 3 )) % 5
// newIndex = (3 + (5 - 3 )) % 5
// newIndex = (4 + (5 - 3 )) % 5
// newIndex = (5 + (5 - 3 )) % 5