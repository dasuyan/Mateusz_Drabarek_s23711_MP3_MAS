package inheritance_dynamic

import java.time.LocalDate

abstract class Person(
    val firstName: String,
    val lastName: String,
    val birthDate: LocalDate
) {
    /**
     * Gets the total income of a person.
     * @return
     */
    abstract val income: Float

    override fun toString(): String {
        return this.javaClass.simpleName + ": " + firstName + " " + lastName
    }
}
