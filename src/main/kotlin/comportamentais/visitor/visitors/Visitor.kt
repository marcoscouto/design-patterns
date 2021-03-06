package comportamentais.visitor.visitors

import comportamentais.visitor.shapes.Circle
import comportamentais.visitor.shapes.Square

interface Visitor {

    fun visitCircle(circle: Circle)

    fun visitSquare(square: Square)

}