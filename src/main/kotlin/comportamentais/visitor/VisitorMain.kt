package comportamentais.visitor

import comportamentais.visitor.shapes.Circle
import comportamentais.visitor.shapes.Square
import comportamentais.visitor.visitors.ReportVisitor

fun main(){

    val shapes = setOf(Circle(), Square())

    val visitor = ReportVisitor()

    shapes.forEach { it.accept(visitor) }

}