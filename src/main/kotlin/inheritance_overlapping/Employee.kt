package inheritance_overlapping

import java.time.LocalDate
import java.util.*

internal enum class EmployeeType {
    Employee,
    Caretaker,
    Receptionist,
    Behaviourist,
    Hairdresser
}
class Employee(
    var name: String,
    var surname: String,
    var birthDate: LocalDate,
    private var medicalTest: Boolean,
    private var number: Int
) {
    private var employeeType = EnumSet.of(EmployeeType.Employee)
        private set
    init {
        employeeType.add(EmployeeType.Caretaker)
        employeeType.add(EmployeeType.Receptionist)
    }

    @Throws(Exception::class)
    fun hasMedicalTest(): Boolean {
        if (employeeType.contains(EmployeeType.Caretaker)) {
            return medicalTest
        }
        throw Exception("The person is not an employee!")
    }

    @Throws(Exception::class)
    fun setMedicalTest(medicalTest: Boolean) {
        if (employeeType.contains(EmployeeType.Caretaker)) {
            this.medicalTest = medicalTest
        } else {
            throw Exception("The person is not an employee!")
        }
    }

    @Throws(Exception::class)
    fun getNumber(): Int {
        if (employeeType.contains(EmployeeType.Receptionist)) {
            return number
        }
        throw Exception("The person is not a receptionist!")
    }

    @Throws(Exception::class)
    fun setNumber(number: Int) {
        if (employeeType.contains(EmployeeType.Receptionist)) {
            this.number = number
        } else {
            throw Exception("The person is not a receptionist!")
        }
    }
}
