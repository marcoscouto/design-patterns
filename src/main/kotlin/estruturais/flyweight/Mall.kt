package estruturais.flyweight

data class Mall(val stores: MutableSet<Store>) {

    fun addStore(store: Store) {
        this.stores.add(store)
    }

}