package inheritance_disjoint

import kotlin.math.PI

class Circle(
    color: String, // inherited property
    private val diameter: Double
) : Shape(color) {
    override val circumference: Double // property override
        get() = 2 * PI * diameter // getter override
    override fun listRelatedShapes(): String { // function override
        return """
            1. Sphere: A sphere is a three-dimensional shape with all points on its surface equidistant from its center.
            2. Cylinder: A cylinder is a three-dimensional shape with a circular base and straight sides that are perpendicular to the base.
            3. Cone: A cone is a three-dimensional shape with a circular base and a vertex that is not in the same plane as the base.
            4. Sector: A sector is a region of a circle enclosed between two radii and an arc.
            5. Segment: A segment is a region of a circle enclosed between a chord and an arc.
            6. Tangent: A tangent is a line that intersects a circle at exactly one point, called the point of tangency.
            7. Chord: A chord is a line segment that connects two points on a circle.
            8. Arc: An arc is a part of the circumference of a circle.
            9. Annulus: An annulus is a region between two concentric circles.
            10. Semicircle: A semicircle is half of a circle, divided by a diameter.
        """.trimIndent()
    }
}