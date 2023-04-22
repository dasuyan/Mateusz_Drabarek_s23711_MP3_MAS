package inheritance_dynamic

import java.time.LocalDate

class Student : Person {
    val number: Int
    val scholarship: Float

    constructor(firstName: String, lastName: String, birthDate: LocalDate, number: Int, scholarship: Float) : super(
        firstName, lastName, birthDate
    ) {
        this.number = number
        this.scholarship = scholarship
    }

    constructor(prevPerson: Person, number: Int, scholarship: Float) : super(
        prevPerson.firstName,
        prevPerson.lastName,
        prevPerson.birthDate
    ) {
        // Copy the old data
        this.number = number
        this.scholarship = scholarship
    }

    override val income: Float
        get() = scholarship
}
