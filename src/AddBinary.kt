import kotlin.math.max

class AddBinarySolution {
    fun addBinary(a: String, b: String): String {
        var aEnd = a.length-1
        var bEnd = b.length-1
        var carry = 0

        val sb = StringBuilder()
        while (aEnd >= 0 || bEnd >= 0 || carry > 0){
            val calcA = if (aEnd >= 0) Character.getNumericValue(a[aEnd]) else 0
            val calcB = if (bEnd >= 0) Character.getNumericValue(b[bEnd]) else 0
            val sum = calcA + calcB + carry
            carry = sum / 2
            sb.append(sum%2)
            aEnd--
            bEnd--
        }

        return sb.reversed().toString()
    }
}