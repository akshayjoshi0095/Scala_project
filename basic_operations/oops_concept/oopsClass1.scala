package basic_operations.oops_concept


// creating a class which consist of two methods
class oopsClass1{

  def add (value_1:Int, value_2:Int): Int={
    value_1+value_2
  }

  def sub(value_1: Int, value_2: Int): Int = {
    return value_1 - value_2
  }

}


// call the class and its method created above
// we can do this in some other file also by importing the class
object oopsClass1_obj1{
    def main(args:Array[String]): Unit = {
      val oopsClass1_obj_var = new oopsClass1;
      println(oopsClass1_obj_var.add(10,2))
      println(oopsClass1_obj_var.sub(10,2 ))
    }
  }


