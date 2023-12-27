class Auxilarly_constructor_class_1(var lenght:Int, var breadth:Int, var height:Int){

  def this()={
    this(1,1,1)
  }

  def this(l:Int, b:Int)={
    this(l,b,1)
  }

  def show_dimensions(): Unit = {
    println(s"len = $lenght, breadth = $breadth, height = $height")
  }

//  val obj1 = new Auxilarly_constructor_class(9, 8, 7)
//  val obj2 = new Auxilarly_constructor_class()
//  val obj3 = new Auxilarly_constructor_class(2, 6)
}


class Auxilarly_constructor_class_2(name:String, typegroup : String, location: String){
  println("primary constructor")

  def this(){
    this("Cow", "Hebivorous", "Grasslands")
    println("Zero Argument Auxilarly constructor")
  }

  def this(name:String){
    this()
    println("Single Argument Auxilarly constructor")
  }

  def this(name:String, typegroup : String){
    this("Lion")
    println("two Argument Auxilarly constructor")
  }

  println(s"name:$name, typegroup:$typegroup, location:$location")
}

object Auxilarly_constructor_class_object{
  def main(args:Array[String]): Unit = {
    val obj1 = new Auxilarly_constructor_class_1(1,2,3)
    obj1.show_dimensions()
    val obj2 = new Auxilarly_constructor_class_1()
    obj2.show_dimensions()
    val obj3 = new Auxilarly_constructor_class_1(6,7)
    obj3.show_dimensions()

    val obj4 = new Auxilarly_constructor_class_2("dog", "Omnivorus", "everywhere")
    val obj5 = new Auxilarly_constructor_class_2()
    val obj6 = new Auxilarly_constructor_class_2("Tiger")
    val obj7 = new Auxilarly_constructor_class_2(name="Dear", typegroup = "herbivorous")

  }
}


//val obj1 = new Auxilarly_constructor_class(9,8,7)
//val obj2 = new Auxilarly_constructor_class()
//val obj3 = new Auxilarly_constructor_class(2,6)
