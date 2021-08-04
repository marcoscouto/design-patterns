package estruturais.facade

class Store {

    private val financingDepartment = FinancingDepartment()
    private val logisticsDepartment = LogisticsDepartment()

    fun processBuy(product: Product) {
        println("Initializing ${product.name} order")
        financingDepartment.processPayment()
        financingDepartment.createInvoice(product)
        logisticsDepartment.sendProduct(product)
    }

}