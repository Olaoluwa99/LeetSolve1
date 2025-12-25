/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class MergeTwoSolution {
    fun mergeTwoListsOld(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) return list2
        if (list2 == null) return list1

        var mergedListNode : ListNode? = null
        var currentNode : ListNode? = null
        var nList1 : ListNode? = list1
        var nList2 : ListNode? = list2

        while (nList1 != null && nList2 != null){
            if (nList1.`val` > nList2.`val`){
                val new = ListNode(nList2.`val`)
                if (mergedListNode == null){
                    mergedListNode = new
                    currentNode = new
                }else{
                    currentNode?.next = new
                    currentNode = currentNode?.next
                }
                nList2 = nList2.next
            }else{
                val new = ListNode(nList1.`val`)
                if (mergedListNode == null){
                    mergedListNode = new
                    currentNode = new
                }else{
                    currentNode?.next = new
                    currentNode = currentNode?.next
                }
                nList1 = nList1.next
            }
        }

        if (nList1 != null){
            currentNode?.next = nList1
        }
        if (nList2 != null){
            currentNode?.next = nList2
        }
        return mergedListNode
    }

    fun mergeTwoListsG(list1: ListNode?, list2: ListNode?): ListNode? {
        // 1. Create a "Dummy" node. This anchors the start of our new list.
        // We will return dummy.next at the end.
        val dummy = ListNode(-1)
        var current = dummy

        // Pointers for iteration
        var p1 = list1
        var p2 = list2

        // 2. Iterate while both lists have data
        while (p1 != null && p2 != null) {
            if (p1.`val` <= p2.`val`) {
                current.next = p1 // Point to the EXISTING node in list1
                p1 = p1.next      // Move list1 pointer forward
            } else {
                current.next = p2 // Point to the EXISTING node in list2
                p2 = p2.next      // Move list2 pointer forward
            }
            current = current.next!!
        }
        if (p1 != null) {
            current.next = p1
        } else if (p2 != null) {
            current.next = p2
        }
        return dummy.next
    }

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) return list2
        if (list2 == null) return list1

        val mainNode = ListNode(-1)
        var currentNode = mainNode

        var p1 = list1
        var p2 = list2

        while (p1 != null && p2 != null){
            if (p1.`val` <= p2.`val`){
                currentNode.next = p1
                p1 = p1.next
            }else {
                currentNode.next = p2
                p2 = p2.next
            }
            currentNode = currentNode.next!!
        }

        if (p1 != null){
            currentNode.next = p1
        }else if (p2 != null){
            currentNode.next = p2
        }

        return mainNode.next
    }
}

/*fun ListNode?.toPrintString(): String {
    if (this?.`val` == null) return "Empty"
    var current = this
    var result = ""
    while (current?.`val` != null){
        result += "${current.`val`} -> "
        current = current.next
    }
    return result
}*/

fun ListNode?.toPrintString(): String {
    if (this == null) return "Empty"
    val sb = StringBuilder()
    var current: ListNode? = this
    while (current != null) {
        sb.append("${current.`val`} -> ")
        current = current.next
    }
    return sb.append("null").toString()
}