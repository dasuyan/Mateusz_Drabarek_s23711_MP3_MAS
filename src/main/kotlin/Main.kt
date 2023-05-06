import inheritance_disjoint.Circle
import inheritance_disjoint.Rectangle
import inheritance_disjoint.Shape
import inheritance_disjoint.polymorphism.CannedPineapple
import inheritance_disjoint.polymorphism.ChickenNuggets
import inheritance_disjoint.polymorphism.Food
import inheritance_dynamic.Sensei
import inheritance_dynamic.SchoolDirector
import inheritance_dynamic.Person
import inheritance_dynamic.Karateka
import inheritance_multiaspect.Convertible
import inheritance_multiaspect.FossilFuelType
import inheritance_multiaspect.RoofType
import inheritance_multiaspect.Suv
import inheritance_multiple.BehaviouristCaretaker
import inheritance_overlapping.Employee
import inheritance_overlapping.EmployeeType
import java.time.LocalDate
import java.time.Year


fun main() {
//     testDisjointAbstractClass()
//     testDisjointPolymorphism()
//     testOverlappingInheritance()
//     testMultipleInheritance()
//     testMultiAspectInheritance()
//     testInheritanceDynamicCopying()
}

fun testDisjointAbstractClass() {
    val circle: Shape = Circle("yellow", 12.0)
    val rectangle: Shape = Rectangle("green", 6.0, 7.0)

    println("The circumference: ${circle.circumference} and color: ${circle.color}")
    println(circle.listRelatedShapes())
    println(circle.classNameBackwards())

    println()
    println("The circumference: ${rectangle.circumference} and color: ${rectangle.color}")
    println(rectangle.listRelatedShapes())
    println(rectangle.classNameBackwards())
}
fun testDisjointPolymorphism() {
    val chicken: Food = ChickenNuggets(23.0, 26.0, 26.0, 0.75, 0.07)
    val pineapple: Food = CannedPineapple(0.21, 30.34, 0.99, 0.242, 0.031)

    println(chicken.getNutritionalScore())
    println(pineapple.getNutritionalScore())
}
fun testOverlappingInheritance() {
    val employee = Employee("Doctor", "Mario", LocalDate.of(1964, 10, 11), true, 155)
    employee.employeeType.add(EmployeeType.Behaviourist)
    employee.employeeType.add(EmployeeType.Receptionist)
    employee.setNumber(666)

    try {
        println("Receptionist's number ${employee.getNumber()}")
        println("Has a permit to work with aggressive and dangerous cats: ${employee.canWorkWithAggressiveCats()}")
    } catch (e: Exception) {
        e.printStackTrace()
    }
}
fun testMultipleInheritance() {
    val caretaker = BehaviouristCaretaker("Dante", "Alighieri",
        LocalDate.of(1666,6,6),
        "male", "123456789",
        LocalDate.of(1700,7,7),
        null,
        6666,true,
        mutableListOf("Luci", "Stella", "Bael"))
    println(caretaker)
}
fun testMultiAspectInheritance() {
    val suv = Suv(
        modelName = "CX-5",
        brand = "Mazda",
        productionYear = Year.of(2022),
        replaceableBattery = null,
        universalChargingStationCompatibility = null,
        suitableFuelType = FossilFuelType.Gasoline,
        co2MgPerKm = 1660,
        has4x4DriveMode = true,
        maxSuspensionHeightMillimeters = 220
    )
    val convertible = Convertible(
        modelName = "Roadster", brand = "Tesla", productionYear = Year.of(2023),
        replaceableBattery = false,
        universalChargingStationCompatibility = true,
        suitableFuelType = null,
        co2MgPerKm = null,
        roofType = RoofType.RetractableHardtop,
        accelerationTo100KphSeconds = 2.1
    )
    suv.makeASound()
    suv.refuel()
    println(suv)

    println()

    convertible.makeASound()
    convertible.recharge()
    println(convertible)
}
fun testInheritanceDynamicCopying() {
    // Create a student
    var p1: Person = Karateka("Bruce", "Maraj", LocalDate.of(2001, 11, 3), 385, 760)
    println(p1)

    // Create an Sensei based on the Karateka
    p1 = Sensei(p1, "red", 7400)
    println(p1)

    // Create a SchoolDirector based on the Sensei
    p1 = SchoolDirector(p1, 12600)
    println(p1)
}