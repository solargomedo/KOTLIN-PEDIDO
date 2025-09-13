sealed class EstadoPedido {
    object Pendiente : EstadoPedido()
    object EnPreparacion : EstadoPedido()
    object ListoParaEntrega : EstadoPedido()
    object Error : EstadoPedido()
}

fun inicializarCatalogo(): List<Producto> {
    return listOf(
        ProductoPrincipal("Hamburguesa Clásica", 15, 8990, false),
        ProductoPrincipal("Salmón Grillado", 20, 15990, true),
        ProductoBebida("Coca Cola", "mediano", 1990, 5),
        ProductoBebida("Jugo Natural", "grande", 2990, 5)
    )
}
