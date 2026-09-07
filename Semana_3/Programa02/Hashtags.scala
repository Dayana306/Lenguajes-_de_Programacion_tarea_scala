/*
 * PROGRAMA: Limpieza de Hashtags
 * AUTORA: 'Prado Lozada, Alison Dayana'
 * CODIGO: U23241052
 * FECHA DE CREACIÓN: 06/09/2026
 *
 * DESCRIPCIÓN:
 * Este programa recibe un conjunto de hashtags y realiza
 * diferentes operaciones para limpiar las etiquetas:
 * eliminación de espacios, conversión a minúsculas,
 * eliminación de etiquetas inválidas y concatenación.
 */

object Hashtags {

  def main(args: Array[String]): Unit = {

    /*
     * Conjunto original de hashtags.
     *
     * Existen etiquetas repetidas implícitamente debido
     * a diferencias de mayúsculas y espacios.
     */
    val hashtags = Set(
      "Scala",
      " scala ",
      "PROGRAMACION",
      " Programacion ",
      "IA",
      " AI ",
      "Java",
      " Desarrollo "
    )

    /*
     * map:
     *
     * trim elimina espacios al inicio y al final.
     *
     * toLowerCase convierte todas las etiquetas
     * a minúsculas.
     */
    val hashtagsLimpios =
      hashtags
        .map(_.trim.toLowerCase)

        /*
         * filter:
         * Eliminamos las etiquetas que tengan
         * menos de 3 caracteres.
         */
        .filter(_.length >= 3)

    /*
     * mkString:
     * Une todas las etiquetas restantes utilizando
     * una coma y un espacio como separador.
     */
    val resultado =
      hashtagsLimpios.mkString(", ")

    println("         LIMPIEZA DE HASHTAGS")

    println(
      s"\nHashtags originales: $hashtags"
    )

    println(
      s"\nHashtags procesados: $hashtagsLimpios"
    )

    println("\nCadena final:")

    println(resultado)
  }
}
