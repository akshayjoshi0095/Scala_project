package basic_operations.oops_concept

/*

objective : is to write a class with variable length args to the constructor

Below class takes 3 arguments in case of primary constuctor, but we can call it with 2 arguments or
with zero arguments - This is achieved using auxiliary constuctor concept


## Three types of constructor:
1- default constructor - mean zero args to class
2- primary constructor - fixed length args to class
3- auxiliary constructor - variable length args to class


 */

class oopsClassWithConstructor(length:Int, breadth: Int, height:Int ) {

  // Auxiliary constructor of the class
  def this(){
    this(1,1,1)
  }

  def this(l: Int, h:Int){
    this(l,1,h)
  }

  def area():Int={
    length * breadth *height
  }

  def perimeter(): Int = {
    2*(length+breadth)
  }

}


object oopsClassWithConstructor_obj{
  def main(args:Array[String]): Unit = {
    var oopsClassWithConstructor_obj_var1 = new oopsClassWithConstructor(4,5,6)
    println("primary constructor:")
    println("area:", oopsClassWithConstructor_obj_var1.area())
    println("perimeter:", oopsClassWithConstructor_obj_var1.perimeter())

    var oopsClassWithConstructor_obj_var2 = new oopsClassWithConstructor(4,7)
    println("with variable length argument:")
    println("area:", oopsClassWithConstructor_obj_var2.area())
    println("perimeter:", oopsClassWithConstructor_obj_var2.perimeter())

    var oopsClassWithConstructor_obj_var3 = new oopsClassWithConstructor()
    println("with zero arguments:")
    println("area:", oopsClassWithConstructor_obj_var3.area())
    println("perimeter:", oopsClassWithConstructor_obj_var3.perimeter())
  }
}