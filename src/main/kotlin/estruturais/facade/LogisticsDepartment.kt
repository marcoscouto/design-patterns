package estruturais.facade

class LogisticsDepartment {

        fun sendProduct(product: Product) {
            println("Sending product: ${product.name}")
        }

}