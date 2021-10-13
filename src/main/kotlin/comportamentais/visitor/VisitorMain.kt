package comportamentais.visitor

import comportamentais.visitor.shapes.Circle
import comportamentais.visitor.shapes.Square

fun main(){

    val shapes = setOf(Circle(), Square())

    val visitor = ReportVisitor()

    shapes.forEach { it.accept(visitor) }

}