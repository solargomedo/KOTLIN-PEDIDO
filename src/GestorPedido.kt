class GestorPedido {

    private val catalogo: List<Producto> = inicializarCatalogo()

    fun inicializarCatalogo(): List<Producto> {
        return listOf(
            ProductoPrincipal("Hamburguesa Clásica", 15, 8990, false),
            ProductoPrincipal("Salmón Grillado", 20, 15990, true),
            ProductoBebida("Coca Cola", "mediano", 1990, 5),
            ProductoBebida("Jugo Natural", "grande", 2990, 5)
        )
    }

    fun mostrarCatalogo() {
        println("CATÁLOGO DISPONIBLE")
        catalogo.forEachIndexed { index, producto ->
            val numero = index + 1
            val nombre = producto.nombre
            val precioFormateado = "%,d".format(producto.precio)

            val detalleExtra = when (producto) {
                is ProductoPrincipal -> if (producto.esPremium) "(Premium)" else ""
                is ProductoBebida -> "(${producto.tamano.capitalize()})"
                else -> ""
            }

            println("$numero. $nombre $detalleExtra - $$precioFormateado")
        }
    }
}
