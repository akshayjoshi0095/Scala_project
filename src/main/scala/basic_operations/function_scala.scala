package basic_operations

/*
Index:
1. In a function when we don't return anything, then the default return datatype is Unit eg: fun2()
2- Function with return keyword and default return keyword
3- Anonymous function


Note(interesting fact) : In scala '+' is not an operator like other language its a function, thus if we
want we can create a function with name as '+','**', '/','///' etc


 */


object function_scala {

  def main(args:Array[String]): Unit = {
    println("execution of main started")
    println(add_func(10,20))
    println(subtract_func(10,20))
    println(multiply_func(10,20))
    println(divide_func(20,10))
    println(fun1())
    println(fun1(2))
    fun2()
    println("anaymous function: " + ana_var(8,9))
    println(str_func("Alpha", "Juliet"))

    // way of calling the functions defined under object
    println(Math_sample.add_func(100,200))
    println(Math_sample.multiply_func(100,200))

  }


  // standard way
  def add_func(a: Int, b: Int): Int = {
    return a+b
  }

  // we can remove return keqword, in scala output of last line automatically get returned
  def subtract_func(a: Int, b: Int): Int = {
     a - b
  }

  // we can remove the curly braces also
  def multiply_func(a: Int, b: Int): Int = a * b

  // we can remove the return data type if we already know that the default return type is always
  def divide_func(a: Int, b: Int)= a / b

  def str_func(a: String, b: String)= a + ' ' + b

  // function with default value of arguments
  def fun1(a: Int = 5, b: Int = 10)= a+b

  def fun2(): Unit = {
    println("Learning Scala")
  }

  // anonymous functions
  var ana_var = (a: Int, b:Int) => a*b




  // way of defining the functions inside a parent object
  object Math_sample{
    def add_func(a: Int, b: Int): Int = {
      return a + b
    }
    def subtract_func(a: Int, b: Int): Int = {
      a - b
    }
    def multiply_func(a: Int, b: Int): Int = a * b
    def divide_func(a: Int, b: Int) = a / b
    def str_func(a: String, b: String) = a + ' ' + b

  }


}
