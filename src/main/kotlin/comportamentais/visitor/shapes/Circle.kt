package comportamentais.visitor.shapes

import comportamentais.visitor.visitors.Visitor

class Circle : Shape {

    override fun getArea(): Double {
        return 18.9
    }

    override fun accept(visitor: Visitor) {
        visitor.visitCircle(this)
    }

}