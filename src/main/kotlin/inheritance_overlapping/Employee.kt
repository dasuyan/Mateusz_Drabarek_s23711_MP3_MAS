package inheritance_overlapping

import java.time.LocalDate
import java.util.*

enum class EmployeeType {
    Employee,
    Caretaker,
    Receptionist,
    Behaviourist,
    Hairdresser
}
class Employee(
    val name: String,
    val surname: String,
    val birthDate: LocalDate,
    private var workingWithAggressiveCatsPermit: Boolean,
    private var number: Int
) {
     var employeeType: EnumSet<EmployeeType> = EnumSet.of(EmployeeType.Employee)

    /*init {
        employeeType.add(EmployeeType.Behaviourist)
        employeeType.add(EmployeeType.Receptionist)
    }*/

    @Throws(Exception::class)
    fun canWorkWithAggressiveCats(): Boolean {
        if (employeeType.contains(EmployeeType.Behaviourist)) {
            return workingWithAggressiveCatsPermit
        }
        throw Exception("This person is not a Behaviourist!")
    }

    @Throws(Exception::class)
    fun setWorkingWithAggressiveCatsPermit(workingWithAggressiveCatsPermit: Boolean) {
        if (employeeType.contains(EmployeeType.Behaviourist)) {
            this.workingWithAggressiveCatsPermit = workingWithAggressiveCatsPermit
        } else {
            throw Exception("This person is not a Behaviourist!")
        }
    }

    @Throws(Exception::class)
    fun getNumber(): Int {
        if (employeeType.contains(EmployeeType.Receptionist)) {
            return number
        }
        throw Exception("This person is not a receptionist!")
    }

    @Throws(Exception::class)
    fun setNumber(number: Int) {
        if (employeeType.contains(EmployeeType.Receptionist)) {
            this.number = number
        } else {
            throw Exception("This person is not a receptionist!")
        }
    }
}
