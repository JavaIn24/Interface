package Task3

fun main (){
val array = arrayOf(1,6,715,75,45,6,23,15,98,45)
    twoMaxNumb(array)
}

fun twoMaxNumb (array: Array <Int>) {
    array.sort()
    println("Второе максимальное значение массива равно ${array[array.size - 2]} ")

}