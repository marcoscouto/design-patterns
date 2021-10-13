package comportamentais.visitor.shapes

import comportamentais.visitor.visitors.Visitor

interface Shape {

    fun getArea(): Double

    fun accept(visitor: Visitor)

}
