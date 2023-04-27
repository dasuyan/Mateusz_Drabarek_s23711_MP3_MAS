package inheritance_multiple

import java.time.LocalDate

open class Behaviourist(
    firstName: String, lastName: String, birthDate: LocalDate, sex: String, nationalId: String,
    employmentDate: LocalDate, layoffDate: LocalDate?, salary: Long,
    val canWorkWithAggressiveCats: Boolean
) :
    Employee(firstName, lastName, birthDate, sex, nationalId, employmentDate, layoffDate, salary) {

    override fun toString(): String {
        return """
            A behaviourist-caretaker: $firstName $lastName
            |   tenure: $tenure years, salary: $salary
            |   Can work with aggressive cats: $canWorkWithAggressiveCats
        """.trimIndent()
    }
}

