package inheritance_multiple

import java.time.LocalDate


abstract class Person(val firstName: String, val lastName: String, val birthDate: LocalDate, val sex: String) {
    abstract val income: Double
}

