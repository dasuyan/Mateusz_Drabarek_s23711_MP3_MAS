package inheritance_dynamic

import java.time.LocalDate

class Peasant : Person {
    val isMedicalTest: Boolean
    val salary: Float

    constructor(
        firstName: String?,
        lastName: String?,
        birthDate: LocalDate?,
        medicalTest: Boolean,
        salary: Float
    ) : super(
        firstName!!, lastName!!, birthDate!!
    ) {
        isMedicalTest = medicalTest
        this.salary = salary
    }

    constructor(prevPerson: Person, medicalTest: Boolean, salary: Float) : super(
        prevPerson.firstName,
        prevPerson.lastName,
        prevPerson.birthDate
    ) {
        // Copy the old data

        // Remember the new one
        isMedicalTest = medicalTest
        this.salary = salary
    }

    override val income: Float
        get() = salary
}
