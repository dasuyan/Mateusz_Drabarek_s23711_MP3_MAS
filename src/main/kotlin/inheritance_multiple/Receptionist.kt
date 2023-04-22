package inheritance_multiple

import java.time.LocalDate


class Pensioner(
    firstName: String, lastName: String, birthDate: LocalDate, sex: String,
    val pension: Double
) :
    Person(firstName, lastName, birthDate, sex) {
    override val income: Double
        get() = pension
}

