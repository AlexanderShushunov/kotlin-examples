fun main(args: Array<String>) {
    println(staticFoo("+"))
    println("+".trickyFoo())
}

fun staticFoo(input: String): String {
    return input + "!"
}

fun String.trickyFoo(): String {
    return this + "!"
}
