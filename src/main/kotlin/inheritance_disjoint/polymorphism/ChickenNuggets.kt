package inheritance_disjoint.polymorphism

class ChickenNuggets(
    fat: Double,
    carbohydrates: Double,
    protein: Double,
    private val sodium: Double,
    private val cholesterol: Double
) : Food(fat, carbohydrates, protein) {
    override val freshness = Freshness.FRIED
    override fun getNutritionalScore(): String {
        val proteinScore = protein * 4
        val fatScore = fat * 9
        val carbohydrateScore = carbohydrates * 4

        val sodiumScore = sodium * -170
        val cholesterolScore = cholesterol * -240

        val sum = proteinScore + fatScore + carbohydrateScore + sodiumScore + cholesterolScore
        return "The nutritional score of chicken nuggets equals $sum"
    }
}