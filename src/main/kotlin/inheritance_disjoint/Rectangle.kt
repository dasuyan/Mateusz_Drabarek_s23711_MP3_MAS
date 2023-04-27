package inheritance_disjoint

class Rectangle(
    color: String, // inherited property
    private val sideX: Double,
    private val sideY: Double
) : Shape(color) {
    override val circumference: Double // property override
        get() = (2 * sideX) + (2 * sideY) // getter override
    override fun listRelatedShapes(): String { // function override
        return """
            1. Square: A square is a rectangle with all sides equal in length.
            2. Rhombus: A rhombus is a parallelogram with all sides equal in length, and opposite angles equal.
            3. Parallelogram: A parallelogram is a quadrilateral with opposite sides parallel and equal in length.
            4. Trapezoid: A trapezoid is a quadrilateral with one pair of opposite sides parallel.
            5. Rectangle: A rectangle is a quadrilateral with four right angles.
            6. Cube: A cube is a three-dimensional shape with six congruent square faces, all right angles, and all edges equal in length.
            7. Cuboid: A cuboid is a three-dimensional shape with six rectangular faces and all right angles. It is also known as a rectangular prism.
            8. Golden rectangle: A golden rectangle is a rectangle whose sides are in the golden ratio, approximately 1:1.618.
            9. Golden spiral: A golden spiral is a logarithmic spiral whose growth factor is the golden ratio.
        """.trimIndent()
    }
}