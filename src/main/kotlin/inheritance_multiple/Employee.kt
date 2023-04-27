package inheritance_multiple

import java.time.LocalDate
import java.time.temporal.ChronoUnit


abstract class Employee(firstName: String, lastName: String, birthDate: LocalDate, sex: String,
                        val nationalId: String,
                        employmentDate: LocalDate,
                        layoffDate: LocalDate?,
                        val salary: Long
) :
    Person(firstName, lastName, birthDate, sex) {
    val tenure: Long = ChronoUnit.YEARS.between(employmentDate, layoffDate ?: LocalDate.now())
}

