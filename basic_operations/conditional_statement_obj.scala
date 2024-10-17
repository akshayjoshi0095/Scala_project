package basic_operations

/*
## Differece b/t while and do-while ?
> in do-while loop, even if condition is not met, loop will run atleast once, because condition validation happens
after action
> in while, first condition get validated then only action happens, hence loop may not run even once.


 */


object conditional_statement_obj {

  def main(args:Array[String]): Unit = {
//    conditional_fun(80)
//    println()
//    conditional_expression_fuc(marks = 55)
//    println()
    for_loop_fun()
//    println()
//    while_loop_fun

  }



  def conditional_fun(marks: Int): Unit = {
    // if-elif-else with ==, &&, || operators
    // && - and
    // || - or
    // == - equal to operator

    if (marks >= 75) {
      println("Distinction")
    }
    else {
      if (marks < 75 && marks >= 60) {
        println("First class")
      }
      else {
        if (marks < 60 && marks >= 50) {
          println("Second class")
        }
        else {
          if (marks < 50 && marks >= 40) {
            println("Third class")
          }
          else {
            println("Fail")
          }
        }

      }
    }
  }



  def conditional_expression_fuc(marks: Int ): Unit = {
    println(if(marks >= 75) "Distinction" else
      if(marks < 75 && marks >= 60) "First class" else
        if(marks < 60 && marks >= 50) "Second class" else
          if(marks < 50 && marks >= 40) "Third class" else "Fail")
   // println(if(marks >= 75) "Distinction" else "Passed")
  }

  def for_loop_fun(): Unit = {
    // By default scala will understand i as variable hence no need to mention it here
    // <- is generator
    // for loop using to
    for(i <- 1 to 5){
      println("i using to "+ i)
    }

    // for loop using until
    for (i <- 1 until(6)){
      println("i using until "+ i)
    }


    for (i <- 1 until (20) by 3) {
      println("i using until " + i)
    }

    // nested for loop
    for (i<- 11 to 15; j<- 1 to 3){
      println(i + "nested loop "+ j)
    }

    // for iterating over a list
    var lst = List(1,2,3,4,5,6,7,8,9,10)
    for (i <- lst){
      println(i + " from lst")
    }

    println("for loop with condition")
    for (i <- lst; if i%2 == 0){
      println(i + " from lst with condition")
    }

    println("for loop with expression")
    var res = for {i<- 1 to 10; if i%2==0} yield {
      i * i
    }
    println("res is :" + res)
    println("data type of res :" + res.getClass.getName)

  }

  def while_loop_fun(): Unit = {
    var x = 1
    println("while loop:")
    while (x <= 10){
      println("value of x is "+ x)
      x += 1
    }
    var y = 1
    println("Do-while loop:")
    do{
      println("value of y is "+ y)
      y += 1
    }
    while (y <= 10)
  }
}
