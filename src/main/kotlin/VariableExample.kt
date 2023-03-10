/**
 * 최대한 val로 변수를 활용하고, 이후에 변수의 변경이 필요한 경우 var를 활용합니다.
 */
fun main() {
    var name = "Ryan"
    var name2: String = "Ryan"
    println("name:${name}, name2:${name2}")

    val age = 10L
    val age2: Long = 10L
    println("age:${age}, age2:${age2}")

    var safeCallNumber: Long? = null
    safeCallNumber = 10L

    if (10 is Int) {
        println("dollar is Int")
    }
    if (10L is Long) {
        println("dollar2 is Long")
    }
    if (10.0 is Double) {
        println("dollar3 is Double")
    }
    if (10.0f is Float) {
        println("dollar4 is Float")
    }
}
