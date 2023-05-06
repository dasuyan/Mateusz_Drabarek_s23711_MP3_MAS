package inheritance_disjoint.polymorphism

class CannedPineapple(
    fat: Double,
    carbohydrates: Double,
    protein: Double,
    private val potassium: Double,
    private val calcium: Double
) : Food(fat, carbohydrates, protein) {
    override val freshness = Freshness.CANNED
    override fun getNutritionalScore(): String {
        val proteinScore = protein * 4
        val fatScore = fat * 9
        val carbohydrateScore = carbohydrates * 4

        val potassiumScore = potassium * 500
        val calciumScore = calcium * 2000

        val sum = proteinScore + fatScore + carbohydrateScore + potassiumScore + calciumScore
        return "The nutritional score of canned pineapple equals $sum"
    }
}