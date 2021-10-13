package comportamentais.visitor.visitors

import comportamentais.visitor.shapes.Circle
import comportamentais.visitor.shapes.Square

class ReportVisitor : Visitor {

    override fun visitCircle(circle: Circle) {
        println("The area of circle is ${circle.getArea()}")
    }

    override fun visitSquare(square: Square) {
        println("The area of square is ${square.getArea()}")
    }
}