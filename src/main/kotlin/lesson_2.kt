fun main() {
    println("Для входа в приложение Вам нужно решить простой пример.")
    println("Cколько будет 3+5?")
    val userConsole = readln().toInt()
    if (userConsole == 8) {
        println("Верный ответ! Добро пожаловать!")
    } else {
        println("Неверный ответ! Доступ ограничен!")
    }
}



