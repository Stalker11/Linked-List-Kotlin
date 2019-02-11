class KotlinLinkedList<E> {
    private var first: NodeKotlin<E>? = null
    private var size: Int = 0

    constructor() {
        first = null
    }

    fun isEmpty(): Boolean {
        return first == null
    }

    fun addFirst(data: E) {
        val link = NodeKotlin(data)
        link.next = first
        first = link
        size++
    }

    fun removeFirst(): E? {
        first.takeIf { first == null }?.also { throw NullPointerException("List is empty") }
        val temp = first
        first = first?.next
        size--
        return temp?.data
    }

    fun show() {
        var current = first
        current.let {
            println(current?.data)
            first = current?.next
        }
    }

    fun find(data: E): E? {
        var link = first
        var counter = 0
        while (!data?.equals(link?.data)!! && counter <= size) {
            link.takeIf { link == null }?.also { return null }
            link = link?.next
            counter++
        }
        return link?.data
    }

    fun delete(data: E): E? {
        var previous = first
        var current = first
        var counter = 0
        while (!data?.equals(current?.data)!! && counter <= size) {
            current.takeIf { current?.next == null }?.also { return null }
            previous = current
            current = current?.next
            counter++
        }
        if (current == first) {
            first = first?.next
            size--
        } else {
            previous?.next = current?.next!!
        }
        return current?.data
    }
}