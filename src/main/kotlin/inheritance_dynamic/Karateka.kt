package inheritance_dynamic

import java.time.LocalDate

class Karateka : Person {
    private val number: Int
    private val equipmentBudget: Long

    constructor(firstName: String, lastName: String, birthDate: LocalDate, number: Int, equipmentBudget: Long) : super(
        firstName, lastName, birthDate
    ) {
        this.number = number
        this.equipmentBudget = equipmentBudget
    }
    constructor(prevPerson: Person, number: Int, equipmentBudget: Long) : super(
        prevPerson.firstName,
        prevPerson.lastName,
        prevPerson.birthDate
    ) {
        // Copy the old data
        this.number = number
        this.equipmentBudget = equipmentBudget
    }

    override val schoolExpense: Long
        get() = equipmentBudget
}
