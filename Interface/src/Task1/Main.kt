package Task1

fun main (){
    val police = Police("Полиция","02")
    val fireMan = FireMan("Пожарные" , "01")
    police.getInfoAction()
    police.printObjectInfo()
    println("======================")
    fireMan.getInfoAction()
    fireMan.printObjectInfo()
}