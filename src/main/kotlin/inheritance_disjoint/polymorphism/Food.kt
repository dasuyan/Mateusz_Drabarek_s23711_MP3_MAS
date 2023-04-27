package inheritance_disjoint.polymorphism

abstract class Food(
    val fat: Double,
    val carbohydrates: Double,
    val protein: Double
)  {
    abstract val freshness: Freshness
    abstract fun getNutritionalScore(): String
}