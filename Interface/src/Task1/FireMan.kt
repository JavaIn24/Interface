package Task1

class FireMan (name: String, phone: String) : SOS(name, phone), Description {
    override fun getInfoAction() {
        println("Служба $name которая вызывается по телефону $phone тушит пожары")
    }

    override fun printObjectInfo() {
        println("Служба пожарной безопасности обеспечивает тушение пожаров на территории страны")
    }
}