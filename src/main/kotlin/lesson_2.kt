fun main() {
    val employe = 50
    val trainees = 30
    val employeSalary = employe*30000
    val trainessSalary = trainees*20000
    val totalSalary = employeSalary+trainessSalary

    println ("Расходы на постоянных сотрудников: $employeSalary")
    println ("Общие расходы после прихода стажеров: $totalSalary")
    println ("Средняя зп всех сотрудников: ${totalSalary/(employe+trainees) }  ")



}