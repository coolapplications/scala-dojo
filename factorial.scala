object scalaLoops {

  def main(args: Array[String]): Unit = {

    def factorial(n: Int): Int = {
      if (n == 0)
        return 1
      else
        return n * factorial(n - 1)
    }
    println(factorial(5))
  }
}
