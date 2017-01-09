object Factorial {

  def factorial(x: Int): Int = {
    def factorialIter(x: Int, res: Int): Int = {
      if(x == 0)
        res
      else
        factorialIter(x - 1 , x * res)
    }
    factorialIter(x, 1)
  }

  factorial(4)
  factorial(3)
}
