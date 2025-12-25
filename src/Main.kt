fun main() {
    //Two sum
    /*val array = intArrayOf(2,7,11,15)
    val solution = TwoSumSolution1()
    val result = solution.twoSum(array, 9)
    println("${result[0]} - ${result[1]}")*/

    //Palindrome
    /*val solution = PalindromeSolution()
    val result = solution.isPalindrome(124555421)
    println(result.toString())*/

    /*val solution = RomanNumeralsSolution()
    val result = solution.romanToInt("LX")
    println(result.toString())*/

    /*val solution = LongestCommonPrefixSolution()
    val list1 = arrayOf("flower","flow","flight")
    val list2 = arrayOf("dog","racecar","car")
    val result1 = solution.longestCommonPrefix(list1)
    val result2 = solution.longestCommonPrefix(list2)
    println(result1)
    println(result2)*/

    /*val solution = ValidParenthesesSolution()
    val result1 = solution.isValid("([])")
    val result2 = solution.isValid("()[]{}")
    val result3 = solution.isValid("(]")
    val result4 = solution.isValid("([)]")
    println(result1)
    println(result2)
    println(result3)
    println(result4)*/

    /*val solution = MergeTwoSolution()
    val mL1 = ListNode(1)
    val l2 = ListNode(5)
    val l3 = ListNode(6)
    val l4 = ListNode(11)
    mL1.next = l2
    l2.next = l3
    l3.next = l4
    l4.next = null

    val mL2 = ListNode(2)
    val m2 = ListNode(4)
    val m3 = ListNode(7)
    val m4 = ListNode(10)
    mL2.next = m2
    m2.next = m3
    m3.next = m4
    m4.next = null

    val result = solution.mergeTwoLists(mL1, mL2)
    println(result.toPrintString())*/

    /*val solution = RemoveDuplicatesSolution()
    println(solution.removeDuplicates(intArrayOf(0,0,1,1,1,2,2,3,3,4,4,4,4,6,7)))*/

    val solution = RemoveElementSolution()
    println(solution.removeElement(intArrayOf(3,2,2,3), `val` = 3))
    println(solution.removeElement(intArrayOf(0,1,2,2,3,0,4,2), `val` = 2))
}












