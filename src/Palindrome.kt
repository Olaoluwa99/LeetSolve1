class PalindromeSolution {
    fun isPalindromeOla(x: Int): Boolean {
        val r = x.toString()
        val rList = r.toMutableList()

        rList.forEachIndexed { index, value ->
            if (value != rList[rList.size - 1 - index]){
                return false
            }
        }
        return true
    }

    fun isPalindrome(x: Int): Boolean {
        return x.toString() == x.toString().reversed()
    }
}