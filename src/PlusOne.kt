class PlusOneSolution {
    fun plusOneOld(digits: IntArray): IntArray {
        if (digits[digits.size-1] != 9){
            digits[digits.size-1] = digits[digits.size-1] + 1
            return digits
        }

        //
        digits[digits.size-1] = 0
        var mover = digits.size-2
        var balance = 1

        //
        while (mover >= 0 && balance != 0){
            val new = digits[mover] + 1
            balance = 0
            if (new > 9) {
                balance = 1
                digits[mover] = 0
            }else{
                digits[mover] = new
                return digits
            }
            mover -= 1
        }

        if (balance == 1){
            return (intArrayOf(1) + digits)
        }
        return intArrayOf()
    }

    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.indices.reversed()) {
            if (digits[i] < 9) {
                digits[i]++
                return digits
            }
            digits[i] = 0
        }
        val result = IntArray(digits.size + 1)
        result[0] = 1
        return result
    }
}