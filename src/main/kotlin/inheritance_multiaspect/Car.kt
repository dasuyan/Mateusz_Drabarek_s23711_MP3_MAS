package inheritance_multiaspect

import java.time.Year

abstract class Car(
    val modelName: String,
    val brand: String,
    val productionYear: Year,
    val replaceableBattery: Boolean?,
    val universalChargingStationCompatibility: Boolean?,
    val suitableFuel: FossilFuelType?,
    val co2MgPerKm: Long?,
) {
    /*
    * The one criterion for inheritance of Car is by fuel type, the other is by car body style (e.g. SUV, sedan, truck, convertible)
    * The "absorbed" aspect is the fuel: electricity and fossil.
    * */
    abstract fun makeASound()
    fun refuel() {
        println("Refueling...")
    }
    fun recharge() {
        println("Recharging...")
    }
}