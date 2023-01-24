/* https://leetcode.com/problems/reverse-linked-list/?envType=study-plan&id=level-1 */

fun main(args: Array<String>) {
    val li = ListNode(1)
    val l2 = ListNode(2)
    val l3 = ListNode(3)
    val l4 = ListNode(4)
    val l5 = ListNode(5)
    li.next = l2
    l2.next = l3
    l3.next = l4
    l4.next = l5

    val reverseList = reverseList(li)
    println(reverseList?.`val`)
    println(reverseList?.next?.`val`)
    println(reverseList?.next?.next?.`val`)
    println(reverseList?.next?.next?.next?.`val`)
    println(reverseList?.next?.next?.next?.next?.`val`)
    println(reverseList?.next?.next?.next?.next?.next?.`val`)
}

fun reverseLinkedList(reversedLinkList: ListNode?, i: Int, reversed: List<Int>): ListNode? {
    return if (i > reversed.size-1) {
        reversedLinkList
    } else {
        reversedLinkList?.next = ListNode(reversed[i])
        reverseLinkedList(reversedLinkList?.next, i + 1, reversed)
        reversedLinkList
    }
    return reversedLinkList
}

fun reverseList(head: ListNode?): ListNode? {
    if (head == null) return head
    val list = ArrayList<Int>()
    var current: ListNode? = head
    while (current != null) {
        list.add(current.`val`)
        current = current.next
    }
    val reversed = list.asReversed()
    return reverseLinkedList(ListNode(reversed.first()), 1, reversed.toList())
}
