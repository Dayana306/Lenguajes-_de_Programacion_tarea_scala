/*
 * PROGRAMA: Lecturas Rápidas - Funciones de Orden Superior
 * AUTORA: 'Prado Lozada, Alison Dayana'
 * CODIGO: U23241052
 * FECHA DE CREACIÓN: 06/09/2026
 *
 * DESCRIPCIÓN:
 * Este programa utiliza funciones de orden superior para
 * filtrar libros de menos de 200 páginas, transformar sus
 * títulos a mayúsculas, agregar un prefijo y calcular
 * el total de caracteres de los títulos procesados.
 */

// Clase que representa un libro.
case class Libro(
  titulo: String,
  autor: String,
  paginas: Int
)

object LecturasRapidasFunciones {

  /*
   * Función de orden superior.
   *
   * Recibe:
   * - una lista de libros
   * - una función para filtrar
   * - una función para transformar
   *
   * Retorna una lista de Strings.
   */
  def procesarLibros(
      libros: List[Libro],
      filtro: Libro => Boolean,
      transformacion: Libro => String
  ): List[String] = {

    // filter recibe una función como parámetro.
    val librosFiltrados =
      libros.filter(filtro)

    // map recibe una función como parámetro.
    val resultado =
      librosFiltrados.map(transformacion)

    resultado
  }

  def main(args: Array[String]): Unit = {

    // Lista de libros.
    val libros = List(
      Libro(
        "El Principito",
        "Antoine de Saint-Exupéry",
        96
      ),
      Libro(
        "Don Quijote",
        "Miguel de Cervantes",
        863
      ),
      Libro(
        "1984",
        "George Orwell",
        328
      ),
      Libro(
        "El Viejo y el Mar",
        "Ernest Hemingway",
        127
      ),
      Libro(
        "Aura",
        "Carlos Fuentes",
        160
      )
    )

    /*
     * Función que determina qué libros cumplen
     * la condición de lectura rápida.
     */
    val filtroRapido: Libro => Boolean =
      libro => libro.paginas < 200

    /*
     * Función que transforma el título.
     */
    val transformarTitulo: Libro => String =
      libro =>
        "LECTURA CORTA: " +
          libro.titulo.toUpperCase

    /*
     * Ejecutamos la función de orden superior.
     */
    val lecturasRapidas =
      procesarLibros(
        libros,
        filtroRapido,
        transformarTitulo
      )

    /*
     * Calculamos el total de caracteres
     * de los títulos procesados.
     */
    val totalCaracteres =
      lecturasRapidas.map(_.length).sum

    println("   LECTURAS RÁPIDAS - SEMANA 04")

    println("\nLibros procesados:")

    lecturasRapidas.foreach(println)

    println(
      s"\nTotal de caracteres: $totalCaracteres"
    )
  }
}