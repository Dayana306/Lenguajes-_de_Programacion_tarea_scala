/*
 * PROGRAMA: Control de reposición de almacén
 * AUTORA: 'Prado Lozada, Alison Dayana'
 * CODIGO: U23241052
 * FECHA DE CREACIÓN: 06/09/2026
 *
 * DESCRIPCIÓN:
 * Este programa recibe una lista de cantidades disponibles
 * y un valor umbral. Utiliza un Iterator para recorrer las
 * cantidades e identificar cuáles necesitan reposición.
 */

object Almacen {
/*
   * Esta función recibe:
   * - una lista con las cantidades disponibles
   * - un valor umbral
   *
   * Utiliza un Iterator para recorrer la lista.
   */
  def verificarReposicion(
      cantidades: List[Int],
      umbral: Int
  ): Unit = {

    // Creamos un iterador a partir de la lista.
    val iterador = cantidades.iterator

    // Recorremos las cantidades disponibles.
    while (iterador.hasNext) {

      val cantidad = iterador.next()

      // Si la cantidad es menor al umbral,
      // necesita reposición inmediata.
      if (cantidad < umbral) {

        println(
          s"Cantidad disponible: $cantidad -> REQUIERE REPOSICIÓN INMEDIATA"
        )
      }
    }
  }

  def main(args: Array[String]): Unit = {

    println("        CONTROL DE ALMACÉN")
    println("")

    // Lista con las cantidades disponibles.
    val cantidades = List(
      25, 8, 50, 12, 3, 40, 7
    )

    // Valor establecido como límite de reposición.
    val umbral = 10

    println(
      s"\nCantidades registradas: $cantidades"
    )

    println(
      s"Umbral de reposición: $umbral"
    )

    println(
      "\nProductos que requieren reposición:"
    )

    // Llamamos a la función.
    verificarReposicion(
      cantidades,
      umbral
    )
  }
}
