/*
 * PROGRAMA: Actualización Masiva de Productos
 * AUTORA: 'Prado Lozada, Alison Dayana'
 * CODIGO: U23241052
 * FECHA DE CREACIÓN: 06/09/2026
 *
 * DESCRIPCIÓN:
 * Este programa trabaja con un Map de productos y precios.
 * Filtra los productos cuyo precio sea mayor a 50.00,
 * aplica un descuento del 20%, transforma el resultado
 * en una lista de Strings y calcula el precio promedio.
 */

object Productos {

  def main(args: Array[String]): Unit = {

    /*
     * Catálogo de productos.
     *
     * La llave representa el nombre del producto
     * y el valor representa su precio.
     */
    val productos = Map(
      "Laptop" -> 2500.00,
      "Mouse" -> 40.00,
      "Teclado" -> 120.00,
      "Monitor" -> 800.00,
      "USB" -> 30.00,
      "Impresora" -> 650.00
    )

    /*
     * filter:
     * Conservamos solamente los productos cuyo
     * precio sea mayor a 50.00.
     */
    val productosFiltrados =
      productos.filter {
        case (_, precio) =>
          precio > 50.00
      }

    /*
     * map:
     * Aplicamos un descuento del 20%.
     *
     * Multiplicar por 0.80 equivale a conservar
     * el 80% del precio original.
     */
    val productosDescuento =
      productosFiltrados.map {
        case (nombre, precio) =>
          (nombre, precio * 0.80)
      }

    /*
     * Transformamos el Map en una Lista de Strings
     * con el formato solicitado.
     */
    val listaProductos =
      productosDescuento.map {
        case (nombre, precio) =>
          f"Producto: $nombre%s | Precio Rebajado: $$$precio%.2f"
      }.toList

    /*
     * Calculamos el promedio de los precios
     * después del descuento.
     */
    val promedio =
      productosDescuento.values.sum /
        productosDescuento.size


    println("      ACTUALIZACIÓN DE PRODUCTOS")
    println("")

    println("\nProductos con descuento:")

    // Mostramos la lista de productos.
    listaProductos.foreach(println)

    // Mostramos el precio promedio.
    println(
      f"\nPrecio promedio después del descuento: $$$promedio%.2f"
    )
  }
}