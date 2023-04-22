package inheritance_dynamic

import java.time.LocalDate

class Pensioner : Person {
    val pension: Float

    constructor(firstName: String, lastName: String, birthDate: LocalDate, pension: Float) : super(
        firstName, lastName, birthDate
    ) {
        this.pension = pension
    }

    /**
     * Creates a new pensioner based on another person.
     */
    constructor(prevPerson: Person, pension: Float) : super(
        prevPerson.firstName,
        prevPerson.lastName,
        prevPerson.birthDate
    ) {
        // Copy the old data
        this.pension = pension
    }

    override val income: Float
        get() = pension
}
