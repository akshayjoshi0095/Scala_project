object Third_Program extends App {

  // understanding match functionality
  var x = 1
  x match {
    case 1 => println("Jan")
    print("month")    // if x value is given as
    case 2 => println("Feb")
    case 3 => println("March")
    case 4 => println("April")
    case 5 => println("May")
    case _ => println("given no. is not correct")
  }
  // for the above scenario if we do not use the above we need to go with : if else if else, this approach will have a
  // bulky code

  // if statement under match block
  val num = 120
  num match {
    case 90 => println("excelent")
    case 70 => println("good")
    case 60 => println("average")
    case _ => println("Low")
  }

  // observer the difference carefully

   num match {
    case a if num >= 90 => println("excellent")
    case a if num >= 70 => println("good")
    case a if num >= 60 => println("average")
    case _ => println("Low")
  }





}
