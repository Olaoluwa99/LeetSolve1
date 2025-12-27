class LengthOfLastWordSolution {
    fun lengthOfLastWord(s: String): Int {

        var stringStart = -1
        var stringEnd = s.length-1

        while (stringEnd >= 0 && s[stringEnd] == ' '){
            stringEnd -= 1
        }

        if (stringEnd < 0) return 0
        stringStart = stringEnd

        while (stringStart >= 0 && s[stringStart] != ' '){
            stringStart -= 1
        }

        return stringEnd - stringStart
    }
}