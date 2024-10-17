package basic_operations

/*

Index:
1- For loop
  > using to keyword
  > using until keyword
  > with gap (i.e alternative value, third value)
  > nested for loop
  > for loop with condition
  > iteration over a list
  > for as expression

2- While loop
  > while loop
  > do-while

## Differece b/t while and do-while ?
> in do-while loop, even if condition is not met, loop will run atleast once, because condition validation happens
after action
> in while, first condition get validated then only action happens, hence loop may not run even once.


 */



object loops_scala {

  def main(args:Array[String]): Unit = {
    println("main function execution started")
//    for_loop_func()
    while_loop_func()
  }

  def for_loop_func(): Unit = {
    println("Scenario 1: Printing 1 to 10 using to keyword in for loop ")
    /*
    for(identifier <- <starting integer> to <= <ending integer>)
    */
    for (i <- 1 to 10) {
      println("i= " + i)
    }

    println("Scenario 2: Printing 1 to 10 using until keyword in for loop ")
    /*
    for(identifier <- <starting integer> until < <ending integer>)
    */
    for (i <- 1 until 11) {
      println("i= " + i)
    }

    println("Scenario 3: Printing 1 to 10 using until/to keyword in for loop with gap more than 1 ")
    for (i <- 1 until (20) by 3) {
      println("i using until " + i)
    }

    println("Scenario 4: nested for loop ")
    for (i <- 1 to 5; j <- 11 until 16 ){
      println(i + " nested for " + j)
    }


    println("Scenario 5: loop iterating over a list ")
    val l = List(11,12,13,14,15,16,17,18,19,20)
    for (i <- l){
      println("iterating on " +i+ " = "  + (i-10))
    }

    println("Scenario 6: for loop with if condition on a list ")
    for (i<-l; if i%2==0){
      println("iterating on " +i )
    }

    println("Scenario 7: for loop with if condition ")
    for (i <- 1 to 11; if i % 2 == 0) {
      println("iterating on " + i)
    }

    println("Scenario 8: for loop with if condition ")
    for (i <- 1 to 11) {
      if (i % 2 == 0) {
        println("iterating on " + i)
      }
    }

    /* When we want i over the given range with some operation inside a collection data type,
    like list comprehension in python */
    println("for loop with expression.")
    var x = for{i<-1 to 10} yield {i*i}
    println("x: "+x)
    println("x datatype: "+x.getClass.getName)
    x.foreach(println)
  }


  def while_loop_func(): Unit = {
    var x = 1
    println("Understanding while loop")
    while(x<=10){
      println("value of x is "+x)
      x += 1
    }

    println("Understanding do-while loop")
    var y = 10
    do{
      println("value of y is "+y)
      y -= 1
    }
    while (y>=1)
  }

}
