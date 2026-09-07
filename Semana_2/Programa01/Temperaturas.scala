/*
 * PROGRAMA: Control de Temperaturas
 * AUTORA: 'Prado Lozada, Alison Dayana'
 * CODIGO: U23241052
 * FECHA DE CREACIÓN: 06/09/2026
 *
 * DESCRIPCIÓN:
 * Este programa recibe una lista de temperaturas y utiliza
 * un iterador para identificar las temperaturas que están
 * fuera del rango de operación segura.
 */

import scala.io.StdIn//

object TemperaturasSemana02 {

  /*
   * Función que verifica las temperaturas.
   *
   * Recibe:
   * - Lista de temperaturas
   * - Temperatura mínima permitida
   * - Temperatura máxima permitida
   */
  def verificarTemperaturas(
      temperaturas: List[Int],
      minimo: Int,
      maximo: Int
  ): Unit = {

    // Creamos un iterador para recorrer la lista.
    val iterador = temperaturas.iterator

    var alerta = false

    println("Temperaturas fuera del rango:")

    // Recorremos las temperaturas utilizando el iterador.
    while (iterador.hasNext) {

      val temperatura = iterador.next()

      // Verificamos si está fuera del rango permitido.
      if (temperatura < minimo || temperatura > maximo) {
        println(s"$temperatura°C")
        alerta = true
      }
    }

    // Si existe alguna temperatura fuera del rango,
    // mostramos la alerta.
    if (alerta) {
      println("Alerta de estabilidad")
    }
  }

  def main(args: Array[String]): Unit = {

    // Lista de temperaturas.
    val temperaturas =
      List(8, 15, 22, 45, 30, 5, 38, 42)

    // Valores ingresados para la prueba.
    val minimo = 10
    val maximo = 40

    println("     CONTROL DE TEMPERATURAS")
    println("")

    println(s"Temperatura mínima: $minimo°C")
    println(s"Temperatura máxima: $maximo°C")
    println()

    verificarTemperaturas(
      temperaturas,
      minimo,
      maximo
    )
  }
}