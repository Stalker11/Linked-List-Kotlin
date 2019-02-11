fun main(args : Array<String>) {
    val list = KotlinLinkedList<String>()
    list.addFirst("Hello")
    list.addFirst("World")
    list.delete("ggg")
    while (!list.isEmpty()){
        list.show()
    }

    /*val listq = mutableListOf<Int>()
    listq.removeAt()
    listq.forEach {  }*/
}