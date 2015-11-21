public class Customer(name: String, val email: String = "none@none.com", otherParam: Int = 100500) {

    init {
        println("it is constructor $otherParam")
    }

    val name = name

    fun foo() {
        println("smth $name $email");
    }
}

data class typicalBean(val param: String)

fun main(args: Array<String>) {
    val customer = Customer(name = "Pety")
    customer.foo()

    val bean = typicalBean("ww")
    println(bean)
    val otherBean = typicalBean("ww")
    println(bean.equals(otherBean))
    println("${bean.hashCode()} ${otherBean.hashCode()}")
}