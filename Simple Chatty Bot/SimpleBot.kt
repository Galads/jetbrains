package bot

import java.util.*


val scanner = Scanner(System.`in`) // Do not change this line

fun main() {
    greet("Aid", "2020") // change it as you need
    remindName()
    guessAge()
    count()
    printVariable()
    test()
    end()
}

fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is " + assistantName + ".")
    println("I was created in " + birthYear + ".")
    println("Please, remind me your name.")
}

fun remindName() {
    print(">")
    val name = scanner.nextLine().replace(" ", "")
    println("What a great name you have, " + name + "!")
}

fun guessAge() {
    println("Let me guess your age.")
    print("Say me remainders of dividing your age by 3, 5 and 7.\n>")
    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is " + age + "; that's a good time to start programming!")
}

fun count() {
    print("Now I will prove to you that I can count to any number you want.\n")
    val num = scanner.nextInt()
    for (i in 0..num) {
        print(i)
        println("!")
    }
}

fun test() {
    when(scanner.nextInt()) {
        2 -> return
        else -> {
            println("Please, try again.")
            test()
        }
    }
}

fun printVariable() {
    println("Let's test your programming knowledge.")
    print("Why do we use methods?\n" +
            "1. To repeat a statement multiple times.\n" +
            "2. To decompose a program into several small subroutines.\n" +
            "3. To determine the execution time of a program.\n" +
            "4. To interrupt the execution of a program.\n>")
}

fun end() {
    println("Congratulations, have a nice day!") // Do not change this text
}
