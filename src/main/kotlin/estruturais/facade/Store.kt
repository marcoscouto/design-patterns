package estruturais.facade

class Store {

    companion object {

        fun processBuy(product: Product) {
            println("Initializing ${product.name} order")
            FinancingDepartment.processPayment()
            FinancingDepartment.createInvoice(product)
            LogisticsDepartment.sendProduct(product)
        }

    }

}