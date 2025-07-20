import com.sun.jdi.Value
import kotlin.math.pow

fun main() {
    val money = 70000
    val percent = 16.7 / 100
    val year = 20
    var result = money * (1 + percent / 1).pow(year)
    println(String.format("%.3f", result))

}
