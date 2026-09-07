/*
 * PROGRAMA: Actualización de Productos - Funciones de Orden Superior
 * AUTORA: 'Prado Lozada, Alison Dayana'
 * CODIGO: U23241052
 * FECHA DE CREACIÓN: 06/09/2026
 *
 * DESCRIPCIÓN:
 * Este programa utiliza funciones de orden superior para
 * seleccionar productos con precios mayores a 50.00,
 * aplicar un descuento del 20%, transformar los resultados
 * y calcular el precio promedio.
 */

object ProductosFunciones {

  /*
   * Función de orden superior.
   *
   * Recibe:
   * - un Map de productos
   * - una función para filtrar
   * - una función para calcular el descuento
   *
   * Retorna un Map actualizado.
   */
  def actualizarProductos(
      productos: Map[String, Double],
      filtro: ((String, Double)) => Boolean,
      descuento: Double => Double
  ): Map[String, Double] = {

    /*
     * filter recibe una función para decidir
     * qué productos conservar.
     */
    val productosFiltrados =
      productos.filter(filtro)

    /*
     * map recibe una función que modifica
     * el precio de cada producto.
     */
    val productosActualizados =
      productosFiltrados.map {
        case (nombre, precio) =>
          (nombre, descuento(precio))
      }

    productosActualizados
  }

  def main(args: Array[String]): Unit = {

    // Catálogo de productos.
    val productos = Map(
      "Laptop" -> 2500.00,
      "Mouse" -> 40.00,
      "Teclado" -> 120.00,
      "Monitor" -> 800.00,
      "USB" -> 30.00,
      "Impresora" -> 650.00
    )

    /*
     * Función que selecciona productos
     * cuyo precio sea mayor a 50.
     */
    val filtro:
      ((String, Double)) => Boolean =
        producto => producto._2 > 50.00

    /*
     * Función que aplica un descuento del 20%.
     *
     * Se conserva el 80% del precio original.
     */
    val descuento:
      Double => Double =
        precio => precio * 0.80

    /*
     * Aplicamos la función de orden superior.
     */
    val productosActualizados =
      actualizarProductos(
        productos,
        filtro,
        descuento
      )

    /*
     * Transformamos el resultado a una lista
     * con el formato solicitado.
     */
    val listaProductos =
      productosActualizados.map {
        case (nombre, precio) =>
          f"Producto: $nombre%s | Precio Rebajado: $$$precio%.2f"
      }.toList

    /*
     * Calculamos el promedio de los precios
     * después del descuento.
     */
    val promedio =
      productosActualizados.values.sum /
        productosActualizados.size

    println("     ACTUALIZACIÓN DE PRODUCTOS")
    println("       FUNCIONES - SEMANA 04")

    println("\nProductos con descuento:")

    listaProductos.foreach(println)

    println(
      f"\nPrecio promedio después del descuento: $$$promedio%.2f"
    )
  }
}