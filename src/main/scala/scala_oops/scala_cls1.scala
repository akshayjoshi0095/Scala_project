package scala_oops

class scala_cls1 {
  def temp_meth_1(): Unit = {
    println("Understanding oops in scala !!!!!")
    println("Other way of creating class and object in scala !!!!!")
  }

}


object scala_cls1_test {
  def main(args:Array[String]): Unit = {
    val obj = new scala_cls1
    obj.temp_meth_1

  }

}


/*
Above eg is of a class with default constructor
here we have define
class scala_cls1 {
}
which means here default constructor is coming into picture which take no/zero arguments
while creating the object of this class we are not passing any arguments

 */