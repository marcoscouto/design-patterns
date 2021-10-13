package comportamentais.visitor

interface Shape {

    fun getArea(): Double

    fun accept(visitor: Visitor)

}
