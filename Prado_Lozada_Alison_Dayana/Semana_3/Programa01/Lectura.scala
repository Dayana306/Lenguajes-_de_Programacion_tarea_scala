/*
 * PROGRAMA: Reporte de Lecturas Rápidas
 * AUTORA: 'Prado Lozada, Alison Dayana'
 * CODIGO: U23241052
 * FECHA DE CREACIÓN: 06/09/2026
 * DESCRIPCIÓN:
 * Este programa trabaja con una lista de objetos de tipo
 * Libro. Filtra los libros que tienen menos de 200 páginas,
 * transforma sus títulos a mayúsculas, agrega un prefijo
 * y calcula el total de caracteres de los títulos procesados.
 */

// Clase que representa un libro.
case class Libro(
  titulo: String,
  autor: String,
  paginas: Int
)

object LecturasRapidas {

  def main(args: Array[String]): Unit = {

    // Lista de libros disponibles.
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
     * filter:
     * Seleccionamos únicamente los libros que tengan
     * menos de 200 páginas.
     */
    val librosCortos =
      libros.filter(_.paginas < 200)

    /*
     * map:
     * Transformamos cada libro seleccionado.
     *
     * Primero obtenemos su título.
     * Luego lo convertimos a mayúsculas.
     * Finalmente agregamos el prefijo solicitado.
     */
    val lecturasRapidas =
      librosCortos.map { libro =>
        "LECTURA CORTA: " +
          libro.titulo.toUpperCase
      }

    /*
     * map(_.length):
     * Calculamos la cantidad de caracteres de cada
     * título procesado.
     *
     * sum:
     * Sumamos todos los caracteres.
     */
    val totalCaracteres =
      lecturasRapidas.map(_.length).sum

    // Mostrar el reporte.
    println("      REPORTE DE LECTURAS RÁPIDAS")


    println("\nLibros procesados:")

    // Mostramos cada título procesado.
    lecturasRapidas.foreach(println)

    // Mostramos el total de caracteres.
    println(
      s"\nTotal de caracteres: $totalCaracteres"
    )
  }
}