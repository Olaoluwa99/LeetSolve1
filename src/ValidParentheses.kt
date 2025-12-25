class ValidParenthesesSolution {
    fun isValidFalse(s: String): Boolean {
        val liveList = mutableListOf<Char>()

        val values = mapOf(
            '}' to '{',
            ')' to '(',
            ']' to '[',
        )

        if (s.isBlank()) return false
        for (i in s.indices){
            when (s[i]){
                '{','(','[', -> {
                    liveList.add(s[i])
                }
                else -> {
                    val compliment = values[s[i]]
                    if (liveList.contains(compliment)){
                        liveList.remove(compliment)
                    }
                }
            }
        }
        return liveList.isEmpty()
    }

    /*fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()

        val bracketMap = mapOf(
            '}' to '{',
            ')' to '(',
            ']' to '['
        )

        for (char in s) {
            if (char in bracketMap.values) {
                stack.add(char)
            } else if (char in bracketMap.keys) {
                if (stack.isEmpty() || stack.removeLast() != bracketMap[char]) {
                    return false
                }
            }
        }
        return stack.isEmpty()
    }*/

    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()

        val map = mapOf(
            '}' to '{',
            ')' to '(',
            ']' to '[',
        )

        for (i in s.indices){
            if (s[i] in map.values){
                stack.add(s[i])
            }else if (s[i] in map.keys){
                if (stack.isEmpty() || stack.removeLast() != map[s[i]]) {
                    return false
                }
            }
        }
        return true
    }
}