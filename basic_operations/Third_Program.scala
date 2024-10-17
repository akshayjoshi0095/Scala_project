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
    case _ => println("Low/default value")        // default case
  }

  // observer the difference carefully

   num match {
    case num if num >= 90 => println("excellent")
    case num if num >= 70 => println("good")
    case num if num >= 60 => println("average")
    case _ => println("Low")
  }

  val age = 40
  val res = age match {
    case 20 => age
    case 30 => age
    case 40 => age
    case 50 => age
    case _ => age
  }
  println("val of result: "+res)

  val marks = 50;
  marks match{
    case marks if marks >= 75 => println("Distinction")
    case marks if marks < 75 && marks >= 60 => println("first division")
    case marks if marks < 60 && marks >= 50 => println("2nd division")
    case marks if marks < 50 && marks >= 40 => println("3rd division")
    case _ => println("not appeared")
  }

}
