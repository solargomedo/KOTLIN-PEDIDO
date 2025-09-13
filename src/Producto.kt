open class Producto(
    val nombre: String,
    open val precio: Int,
    val tiempoDePreparacion: Int,
    val categoria: String

)

class ProductoPrincipal(
    nombre:String,
    tiempoDePreparacion: Int,
    precioBase: Int,
    val esPremium: Boolean

):Producto(
    nombre,
    if(esPremium)(precioBase * 1.2).toInt() else precioBase,
    tiempoDePreparacion,
    "Comida",

    )

class ProductoBebida(
    nombre: String,
    val tamano: String,
    precioBase: Int,
    tiempoDePreparacion: Int
) : Producto(
    nombre,
    when (tamano.lowercase()) {
        "mediano" -> (precioBase * 1.15).toInt()
        "grande" -> (precioBase * 1.3).toInt()
        else -> precioBase
    },
    tiempoDePreparacion,
    "Bebida"
)



















