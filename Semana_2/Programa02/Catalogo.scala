/*
 * ============================================================
 * PROGRAMA: Búsqueda de Producto en Catálogo
 * AUTORA: 'Prado Lozada, Alison Dayana'
 * CODIGO: U23241052
 * FECHA DE CREACIÓN: 06/09/2026
 *
 * DESCRIPCIÓN:
 * Este programa utiliza un Map para almacenar productos
 * y sus precios. Mediante un iterador se busca un producto
 * dentro del catálogo.
 * ============================================================
 */

object Catalogo {

  def main(args: Array[String]): Unit = {

    // Catálogo de productos.
    val productos = Map(
      "Laptop" -> 2500.00,
      "Mouse" -> 80.50,
      "Teclado" -> 150.00,
      "Monitor" -> 950.00,
      "Impresora" -> 600.00
    )

    // Producto utilizado para realizar la prueba.
    val productoBuscado = "Mouse"

    println("       BÚSQUEDA DE PRODUCTOS")
    println("")

    println(s"Producto buscado: $productoBuscado")

    /*
     * Creamos un iterador para recorrer el catálogo.
     */
    val iterador = productos.iterator

    var encontrado = false

    /*
     * Recorremos el catálogo hasta encontrar
     * el producto buscado.
     */
    while (iterador.hasNext && !encontrado) {

      val (nombre, precio) = iterador.next()

      if (nombre.equalsIgnoreCase(productoBuscado)) {

        println(
          f"El precio de $nombre%s es $$$precio%.2f"
        )

        encontrado = true
      }
    }

    /*
     * Si el producto no fue encontrado,
     * mostramos el mensaje correspondiente.
     */
    if (!encontrado) {
      println(
        "Producto no encontrado en el catálogo actual"
      )
    }
  }
}