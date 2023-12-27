package scala_oops

class inheritance_scala {
  def a(): Unit = {
    println("method a from class inheritance_scala")
  }
}

class version_1 extends inheritance_scala{
  def b(): Unit = {
    println("method b from class version_1")
  }
}

class version_2 extends version_1 {
  def c(): Unit = {
    println("method c from class version_2")
  }
}

object understanding_inheritance_scala{
  def main(args:Array[String]): Unit = {
    var obj = new version_2
    obj.c
    obj.b
    obj.a
  }
}