package easy
// https://leetcode.com/problems/middle-of-the-linked-list/description/?envType=study-plan&id=level-1
import ListNode

fun main() {
    val li = ListNode(1)
    val l2 = ListNode(2)
    val l3 = ListNode(3)
    val l4 = ListNode(4)
    val l5 = ListNode(5)
    val l6 = ListNode(6)
    li.next = l2
    l2.next = l3
    l3.next = l4
    l4.next = l5
    l5.next = l6

    println(middleNode(li)?.`val`)
}


fun middleNode(head: ListNode?): ListNode? {
    var current: ListNode? = head
    var length = 0
    // get length of singly linked list
    while (current != null) {
        length++
        current = current.next
    }

    // find middle node
    var midNode: ListNode? = head
    var i = 0
    while (i < length / 2) {
        i++
        midNode = midNode?.next
    }

    return midNode

}