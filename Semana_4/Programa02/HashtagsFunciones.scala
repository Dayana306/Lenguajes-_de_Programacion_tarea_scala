/*
 * PROGRAMA: Limpieza de Hashtags - Funciones de Orden Superior
 * AUTOR: 'Prado Lozada, Alison Dayana'
 * MATRÍCULA: U23241052
 * FECHA DE CREACIÓN: 06/09/2026
 *
 * DESCRIPCIÓN:
 * Este programa utiliza funciones de orden superior para
 * limpiar hashtags, eliminar espacios, convertirlos a
 * minúsculas y eliminar etiquetas con menos de 3 caracteres.
 */

object HashtagsFunciones {

  /*
   * Función de orden superior.
   *
   * Recibe:
   * - un conjunto de hashtags
   * - una función de transformación
   * - una función de validación
   *
   * Retorna un conjunto limpio.
   */
  def limpiarHashtags(
      hashtags: Set[String],
      transformar: String => String,
      validar: String => Boolean
  ): Set[String] = {

    /*
     * map recibe la función transformar.
     */
    val hashtagsTransformados =
      hashtags.map(transformar)

    /*
     * filter recibe la función validar.
     */
    val hashtagsValidos =
      hashtagsTransformados.filter(validar)

    hashtagsValidos
  }

  def main(args: Array[String]): Unit = {

    // Conjunto original de hashtags.
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
     * Función para limpiar cada hashtag.
     *
     * trim:
     * elimina espacios.
     *
     * toLowerCase:
     * convierte a minúsculas.
     */
    val transformar: String => String =
      etiqueta =>
        etiqueta.trim.toLowerCase

    /*
     * Función para validar los hashtags.
     *
     * Solo se aceptan etiquetas con
     * 3 o más caracteres.
     */
    val validar: String => Boolean =
      etiqueta => etiqueta.length >= 3

    /*
     * Aplicamos las funciones de orden superior.
     */
    val hashtagsLimpios =
      limpiarHashtags(
        hashtags,
        transformar,
        validar
      )

    /*
     * Unimos los hashtags utilizando
     * coma y espacio.
     */
    val resultado =
      hashtagsLimpios.mkString(", ")

    println("       LIMPIEZA DE HASHTAGS")
    println("       FUNCIONES - SEMANA 04")

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