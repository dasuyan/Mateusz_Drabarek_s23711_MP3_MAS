package inheritance_multiple

import java.time.LocalDate


class Student(
    firstName: String, lastName: String, birthDate: LocalDate, sex: String,
    override val number: Int, override val income: Double, override val scholarship: Double
) :
    Person(firstName, lastName, birthDate, sex), IStudent {
}

