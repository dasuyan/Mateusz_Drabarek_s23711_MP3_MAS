package inheritance_multiaspect

import java.time.Year

enum class RoofType {
    Textile, DetachableHardtop, RetractableHardtop
}
class Convertible(
    modelName: String, brand: String, productionYear: Year, replaceableBattery: Boolean?,
    universalChargingStationCompatibility: Boolean?, suitableFuelType: FossilFuelType?, co2MgPerKm: Long?,
    val roofType: RoofType,
    val accelerationTo100KphSeconds: Double
)
    : Car(modelName, brand, productionYear, replaceableBattery, universalChargingStationCompatibility, suitableFuelType, co2MgPerKm) {

    override fun makeASound() {
        val sound: String = if (replaceableBattery == true || universalChargingStationCompatibility == true)
            "Bzzzzt..."
        else "Vrooom!"
        println("I'm a convertible: $sound")
    }

    override fun toString(): String {
        return """
                Model: $modelName, Year: $productionYear, Brand: $brand
                |   roof type: $roofType, time to accelerate from 0 to 100 kph: $accelerationTo100KphSeconds seconds
                |   Electric traits:
                |       replaceable battery: $replaceableBattery, compatible with most charging stations: $universalChargingStationCompatibility
                |   Fossil fuel traits:
                |       fuel type: $suitableFuel, carbon monoxide (CO2) emission: $co2MgPerKm mg/km
            """.trimIndent()
    }
}