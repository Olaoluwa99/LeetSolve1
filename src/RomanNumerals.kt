class RomanNumeralsSolution {
    fun romanToIntOld(s: String): Int {
        var x = 0
        val allChars = s.toList()
        allChars.forEachIndexed{index, value->
            when (value){
                'M' -> {
                    x += 1000
                    if (index > 0 && allChars[index-1] == 'C'){
                        x -= 200
                    }
                }
                'D' -> {
                    x += 500
                    if (index > 0 && allChars[index-1] == 'C'){
                        x -= 200
                    }
                }
                'C' -> {
                    x += 100
                    if (index > 0 && allChars[index-1] == 'X'){
                        x -= 20
                    }
                }
                'L' -> {
                    x += 50
                    if (index > 0 && allChars[index-1] == 'X'){
                        x -= 20
                    }
                }
                'X' -> {
                    x += 10
                    if (index > 0 && allChars[index-1] == 'I'){
                        x -= 2
                    }
                }
                'V' -> {
                    x += 5
                    if (index > 0 && allChars[index-1] == 'I'){
                        x -= 2
                    }
                }
                else -> x += 1
            }
        }
        return x
    }

    fun romanToInt(s: String): Int {
        val values = mapOf(
            'M' to 1000,
            'D' to 500,
            'C' to 100,
            'L' to 50,
            'X' to 10,
            'V' to 5,
            'I' to 1,
        )

        var sum = 0

        for (x in s.indices){
            val currentValue = values[s[x]] ?: 0

            if (x < s.length - 1){
                if (currentValue < values[s[x+1]]!!){
                    sum -= currentValue
                }else{
                    sum += currentValue
                }
            }else{
                sum += currentValue
            }
        }
        return sum
    }
}