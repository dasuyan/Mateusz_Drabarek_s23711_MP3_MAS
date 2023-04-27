package inheritance_disjoint
import java.util.*

abstract class Shape(val color: String)  {
    abstract val circumference: Double
    fun classNameBackwards(): String { // function accessible to the inheriting classes
        val className = this::class.java.simpleName
        val length = Shape::class.java.simpleName.length
        val mid = length / 2

        val firstHalf = className.substring(0, mid)
            .replaceFirstChar { if (it.isUpperCase()) it.lowercase(Locale.getDefault()) else it.toString() }
        val secondHalf = className.substring(mid)
            .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }

        return "The reversed classname is: ${secondHalf + firstHalf}"
    }
    abstract fun listRelatedShapes(): String
}