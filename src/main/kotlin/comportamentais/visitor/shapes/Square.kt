package comportamentais.visitor.shapes

import comportamentais.visitor.visitors.Visitor

class Square : Shape {

    override fun getArea(): Double {
        return 12.2
    }

    override fun accept(visitor: Visitor) {
        visitor.visitSquare(this)
    }

}
