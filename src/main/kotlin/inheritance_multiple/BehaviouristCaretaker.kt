package inheritance_multiple

import java.time.LocalDate
import kotlin.random.Random


class BehaviouristCaretaker(
    firstName: String, lastName: String, birthDate: LocalDate, sex: String, nationalId: String,
    employmentDate: LocalDate, layoffDate: LocalDate?, salary: Long, canWorkWithAggressiveCats: Boolean,

    override val listOfCats: MutableList<String>
) :
    Behaviourist(firstName, lastName, birthDate, sex, nationalId, employmentDate, layoffDate, salary, canWorkWithAggressiveCats), ICaretaker {

    override val bonus: Long
        get() {
            val base = tenure * 100
            return if (canWorkWithAggressiveCats)
                base + 250
            else base
        }
    override val income: Long
        get() = salary + bonus
    override val number: String
    init {
        val numericBase = Random.nextLong(1000, 1500)
        val rolePrefix = "BC"
        number = "$rolePrefix$numericBase"
    }

    override fun toString(): String {
        return """
            A behaviourist-caretaker: $firstName $lastName, number: $number
            |   tenure: $tenure years, income: $income
            |   Can work with aggressive cats: $canWorkWithAggressiveCats
            |   List of cats they've taken care of: $listOfCats
        """.trimIndent()
    }
}

