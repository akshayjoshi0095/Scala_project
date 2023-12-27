object cls2_scala_class_object {

  def method_without_argument(): Unit = {
    println("This is method1")
  }
  // where this 'Unit' is the default return type of scala

  def method_with_argument(a:Int,b:Int): Unit = {
    println(s"sum of values is $a+$b")
  }

  def method_with_return(a:Int, b:Int): Int ={
    a + b
  }


  def main(args:Array[String]): Unit = {
    method_without_argument
    method_with_argument(10,20)
    println(method_with_return(2,3))
    println("execution finished")
  }
}


/*
## Third way
> here we are not creating any class explictly, just creating an object inside which all the method have been defined
and also the main method

Note:
  1. When the method does not contains any argument then while calling it inside the main method,we don't need to
  provide the closed braces at the end of the methid

  2. 'Unit' is the default return type of scala like void in Java


 */