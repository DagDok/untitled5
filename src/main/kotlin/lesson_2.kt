fun main() {
    val startHour = 9
    val startMinute = 39
    val timePath = 425
    val timePathHour = timePath / 60
    val timePathMinute = timePath % 60
    println(timePathHour)
    println(timePathMinute)
    var arrivalHour = startHour + timePathHour
    var arrivalMinute = startMinute + timePathMinute
    if (arrivalMinute >= 60) {
        val hour = arrivalMinute / 60
        arrivalMinute = arrivalMinute % 60
        arrivalHour += hour
        println("Время прибытия: $arrivalHour : $arrivalMinute")

    } else {
        println("Время прибытия: $arrivalHour : $arrivalMinute")

    }


}