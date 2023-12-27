package scala_oops

class scala_cls2(empname:String, emp_sal:Int){
  def meth1(): Unit = {
    println("emp name: ", empname)
    println("emp sal: ", emp_sal)
  }

}


object scala_cls2_obj {
  def main(args:Array[String]): Unit = {
    val obj = new scala_cls2("Akshay", 1000)
    obj.meth1()
  }
}


/*
Above class is an eg of class with contructor
class scala_cls2(empname:String, emp_sal:Int){
}

here contructor contains two arguments i.e empname, emp_sal
while creating the object of this class we have to pass value of above two arguments


> if have defined class as
class scala_cls2(var empname:String, var emp_sal:Int)
then scala would create reader and writer method for both the arguments


> if have defined class as
class scala_cls2(val empname:String, val emp_sal:Int)
then scala would create only reader method for both the arguments
as val is readonly type variable type

> if have defined class as
class scala_cls2(private empname:String)
then scala would create only reader method only but that will be private for the arguments

> as we are creating class like
class scala_cls2(empname:String, emp_sal:Int)
this case scala would create argument a object private field

> Auxilary constructor



 */