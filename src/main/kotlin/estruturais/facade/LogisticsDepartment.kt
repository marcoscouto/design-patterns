package estruturais.facade

class LogisticsDepartment {

    companion object {

        fun sendProduct(product: Product) {
            println("Sending product: ${product.name}")
        }

    }

}