import scala.collection.mutable.{Set, ListMap}

object scalaCollections {
  def main(args: Array[String]): Unit = {
    val frutas = Array("Pera", "Manzana", "Naranja")
    println(frutas.length) //Tamaño => 3
    println(frutas.apply(1)) //Posición => Manzana
    println(frutas(1)) // Otra forma de escribir la posición => Manzana
    println(frutas.isEmpty) //Si esta vacio => false
    println(frutas.nonEmpty) //Si no esta vacio => true
    println(frutas.indexOf("Pera")) //Posición de un objeto => 0
  }
}
