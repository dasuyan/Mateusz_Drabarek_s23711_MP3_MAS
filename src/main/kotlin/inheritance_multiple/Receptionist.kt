package inheritance_multiple

import java.time.LocalDate
import java.time.LocalTime
import java.time.temporal.ChronoUnit

class Receptionist(
    firstName: String, lastName: String, birthDate: LocalDate, sex: String,
    nationalId: String, employmentDate: LocalDate, layoffDate: LocalDate?, salary: Long,
    dailyWorkStartTime: LocalTime, dailyWorkFinishTime: LocalTime
) :
    Employee(firstName, lastName, birthDate, sex, nationalId, employmentDate, layoffDate, salary) {

    private val workTime = ChronoUnit.HOURS.between(dailyWorkStartTime, dailyWorkFinishTime)
    private val overtimeBonus = (workTime - 8) * 60
    private val income: Long
        get() = salary + overtimeBonus

    override fun toString(): String {
        return """
            A receptionist: $firstName $lastName
            |   tenure: $tenure years, income: $income
            |   working $workTime hours a day
        """.trimIndent()
    }
}

