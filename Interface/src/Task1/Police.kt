package Task1

class Police(name : String, phone : String) : SOS(name , phone) , Description {
    override fun getInfoAction() {
        println("Служба $name которая вызывается по телефону $phone обеспечивает задерание опасных для общества социальных" +
                "элементов: например квадроберов")
    }

    override fun printObjectInfo() {
        println("Полиция обеспечивает охрану правопорядка на территории страны")
    }
}