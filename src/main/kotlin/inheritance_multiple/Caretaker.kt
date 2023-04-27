package inheritance_multiple

import java.time.LocalDate
import kotlin.random.Random


class Caretaker(
    firstName: String, lastName: String, birthDate: LocalDate, sex: String, nationalId: String,
    employmentDate: LocalDate, layoffDate: LocalDate?, salary: Long,
    override val listOfCats: MutableList<String>,
) :
    Employee(firstName, lastName, birthDate, sex, nationalId, employmentDate, layoffDate, salary), ICaretaker {

    override val bonus: Long = tenure * 100
    override val income: Long = salary + bonus
    override val number: String
    init {
        val numericBase = Random.nextLong(1000, 1500)
        val rolePrefix = "C"
        number = "$rolePrefix$numericBase"
    }

    override fun toString(): String {
        return """
            A caretaker: $firstName $lastName, number: $number
            |   tenure: $tenure years, income: $income
            |   List of cats they've taken care of: $listOfCats
        """.trimIndent()
    }
}

