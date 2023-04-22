package inheritance_multiple

import java.time.LocalDate


class WorkingStudent(
    firstName: String,
    lastName: String,
    birthDate: LocalDate,
    sex: String,
    override val number: Int,
    override val scholarship: Double,
    medicalTest: Boolean,
    salary: Double
) :
    Employee(firstName, lastName, birthDate, sex, medicalTest, salary), IStudent {

    override val income: Double
        get() = super.income + scholarship

    override fun toString(): String {
        return String.format(
            "Working student: %s %s, scholarship: %s, salary: %s ", firstName, lastName,
            scholarship, salary
        )
    }
}

