/* https://leetcode.com/problems/running-sum-of-1d-array/description/ */

fun main(args: Array<String>) {
    // list # 1
    val li = ListNode(1)
    val l2 = ListNode(2)
    val l3 = ListNode(4)
    li.next = l2
    l2.next = l3

    // list # 2
    val ki = ListNode(1)
    val k2 = ListNode(3)
    val k3 = ListNode(4)
    ki.next = k2
    k2.next = k3

    val mergedList = mergeTwoLists(li,ki)
    println(mergedList?.next?.`val`)
    println(mergedList?.next?.next?.`val`)
    println(mergedList?.next?.next?.next?.`val`)
    println(mergedList?.next?.next?.next?.next?.`val`)
    println(mergedList?.next?.next?.next?.next?.next?.`val`)
}

fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    if (l1 == null) return l2
    if (l2 == null) return l1
    return if (l1.`val` < l2.`val`) {
        l1.next = mergeTwoLists(l1.next, l2)
        l1
    } else {
        l2.next = mergeTwoLists(l1, l2.next)
        l2
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}