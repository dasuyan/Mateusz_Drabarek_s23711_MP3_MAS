package inheritance_dynamic

import java.time.LocalDate

class SchoolDirector : Person {
    private val executiveSalary: Long

    constructor(firstName: String, lastName: String, birthDate: LocalDate, executiveSalary: Long) : super(
        firstName, lastName, birthDate
    ) {
        this.executiveSalary = executiveSalary
    }

    constructor(prevPerson: Person, executiveSalary: Long) : super(
        prevPerson.firstName,
        prevPerson.lastName,
        prevPerson.birthDate
    ) {
        // Copy the old data
        this.executiveSalary = executiveSalary
    }

    override val schoolExpense: Long
        get() = executiveSalary
}
