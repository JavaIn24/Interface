package Task2

fun main () {
    println(nod(84 , 26))

}
fun nod (a: Int , b: Int) : Int{
        var a =a
        var b = b
        while ( b != 0) {
            var tmp : Int = a % b
            a = b
            b = tmp
        }
        return a
    }