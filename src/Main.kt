
fun main() {
    val gestor = GestorPedido()
    val pedido = mutableListOf<Producto>()


    gestor.mostrarCatalogo()

    pedido.add(ProductoPrincipal("Hamburguesa Clásica", 15, 8990, false))
    pedido.add(ProductoBebida("Coca Cola", "mediano", 1990, 5))

    val tipoCliente = "VIP"


    val subtotal = calcularSubtotal(pedido)
    val descuento = aplicarDescuento(subtotal, tipoCliente)
    val impuestos = calcularImpuestos(subtotal - descuento)
    val total = subtotal - descuento + impuestos

    var estado = EstadoPedido.Pendiente
    println("Estado: $estado")
    Thread.sleep(3000)
    estado = EstadoPedido.Pendiente
    println("Estado: $estado")
    Thread.sleep(3000)
    estado = EstadoPedido.Pendiente
    println("Estado: $estado")


    println("RESUMEN DEL PEDIDO")
    pedido.forEach { println("${it.nombre} - ${it.precio}") }
    println("Subtotal: $subtotal")
    println("Descuento: $descuento")
    println("Impuestos: $impuestos")
    println("Total a pagar: $total")
    println("Estado final: $estado")
}


fun calcularSubtotal(pedido: List<Producto>) = pedido.sumOf { it.precio }
fun aplicarDescuento(subtotal: Int, tipoCliente: String) =
    if (tipoCliente == "VIP") (subtotal * 0.1).toInt() else 0
fun calcularImpuestos(total: Int) = (total * 0.19).toInt()
