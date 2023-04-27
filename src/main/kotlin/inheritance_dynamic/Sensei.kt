package inheritance_dynamic

import java.time.LocalDate

class Sensei : Person {
    private val belt: String
    private val salary: Long

    constructor(
        firstName: String,
        lastName: String,
        birthDate: LocalDate,
        belt: String,
        salary: Long
    ) : super(
        firstName, lastName, birthDate
    ) {
        this.belt = belt
        this.salary = salary
    }

    constructor(prevPerson: Person, belt: String, salary: Long) : super(
        prevPerson.firstName,
        prevPerson.lastName,
        prevPerson.birthDate
    ) {
        this.belt = belt
        this.salary = salary
    }

    override val schoolExpense: Long
        get() = salary
}
