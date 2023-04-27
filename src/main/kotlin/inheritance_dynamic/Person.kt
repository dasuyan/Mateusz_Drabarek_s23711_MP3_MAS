package inheritance_dynamic

import java.time.LocalDate

abstract class Person(
    val firstName: String,
    val lastName: String,
    val birthDate: LocalDate
) {
    abstract val schoolExpense: Long

    override fun toString(): String {
        return """${this.javaClass.simpleName}: $firstName $lastName
            | and the school spends $schoolExpense on them.
        """.trimMargin()
    }
}
