object understandingCaseClassInScala extends App{

  case class Employee(empname:String, empId:Int){

  }

  val employee_obj = new Employee("Akshay", 100)
  println(employee_obj.empname)
  // here we are printing the value passed to constructor variable while initalizing the class using the object of that class
  // this we cannot do with normal class
  // in pythin normally only we can assess the value of contructor varaible using object

  // Equals, hashcode and ToString
  val employee_obj2 = new Employee("Akshay2", 200)
  println("employee_obj2.toString: ", employee_obj2.toString)
  println("employee_obj2: ", employee_obj2)

  val employee_obj3 = new Employee("Akshay", 100)
  println("comparing case class objects:", employee_obj3==employee_obj)


  // Companion Ojects
  val employee_obj4 = Employee("Akshay", 100)
  println("val of case class object employee_obj4: ", employee_obj4)


  // case object (no companion object because this object itself a companion object)
  case object Person {
    def getPersonalDetails = "My name is Akshay"
  }
  println("Value of method under case object:", Person.getPersonalDetails)

}


  // case object (no companion object because this object itself a companion object)
//  case object Person {
//    def getPersonalDetails = "My name is Akshay"
//  }
//
//  println("Value of method under case object:",Person.getPersonalDetails)
/*

Case Class
> is generally used when we want to store a light weight variable

with case class whichever arguments we have mentioned in the class, they are considered as member fields, hence we
don't required to explictly defined their value using val/var

 */