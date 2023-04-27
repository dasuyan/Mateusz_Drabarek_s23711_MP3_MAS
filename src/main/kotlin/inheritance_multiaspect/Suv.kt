package inheritance_multiaspect

import java.time.Year

class Suv(
    modelName: String, brand: String, productionYear: Year, replaceableBattery: Boolean?,
    universalChargingStationCompatibility: Boolean?, suitableFuelType: FossilFuelType?, co2MgPerKm: Long?,
    val has4x4DriveMode: Boolean,
    val maxSuspensionHeightMillimeters: Int
)
    : Car(modelName, brand, productionYear, replaceableBattery, universalChargingStationCompatibility, suitableFuelType, co2MgPerKm) {

    override fun makeASound() {
        val sound: String = if (replaceableBattery == true || universalChargingStationCompatibility == true)
            "Bzzzzt..."
        else "Vrooom!"
        println("I'm a SUV: $sound")
    }
        override fun toString(): String {
            return """
                Model: $modelName, Year: $productionYear, Brand: $brand
                |   4x4 drive mode: $has4x4DriveMode, maximum suspension height: $maxSuspensionHeightMillimeters mm
                |   Electric traits:
                |       replaceable battery: $replaceableBattery, compatible with most charging stations: $universalChargingStationCompatibility
                |   Fossil fuel traits:
                |       fuel type: $suitableFuel, carbon monoxide (CO2) emission: $co2MgPerKm mg/km
            """.trimIndent()
        }
    }