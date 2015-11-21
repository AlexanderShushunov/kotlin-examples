class likeAStructure(val param: String)


fun main(args: Array<String>) {
    val structure = likeAStructure("ww")
    println(structure)
    filter()
    templates()
    foreach()
    println(withReturn("3"))
    println(withVarargs(1, 2, 3))
    println(namedParams(right = 5, left = 6))
    println(defaultValues(right = 3));
    variables()
}

fun filter() {
    val list = arrayListOf(1, 2, 3)
    println(list.filter { it > 2 })
}

fun templates() {
    val i = 5;
    println("i = $i")
}

fun foreach() {
    val listOfPairs = listOf(
            Pair("one", 1),
            Pair("two", 2),
            Pair("two", 3))
    for ((sting, number) in listOfPairs) {
        println("$sting - $number")
    }
}

fun withReturn(param: String): Int {
    return 5 + param.toInt();
}

fun withVarargs(vararg numbers: Int): Int {
    return numbers.sum();
}

fun namedParams(left: Int, right: Int): Int {
    return left - right;
}

fun defaultValues(left: Int = 0, right: Int = 0): Int {
    return left - right;
}

fun variables() {
    var name = "Alex"
    var otherName : String = "Petya"
    name = "Kolya"
    println("$name $otherName")
    val immutableName = "Alex"
    // immutableName = "Petya" - error
    val nullable: String?
    nullable = null
    // name = null - error
}