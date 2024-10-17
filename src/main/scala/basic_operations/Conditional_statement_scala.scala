package basic_operations

/*
Index:
1. If-else with &&(AND), ||(OR) operator
2. use of match statement


 */

object Conditional_statement_scala {
  def main(args:Array[String]): Unit = {
    println("main function execution started")
    conditions_using_ifelse()
    match_func()
  }


  def conditions_using_ifelse(): Unit = {
    println("Understanding conditional statement functionality")
    var score = 70
    if (score >= 90 && score <= 100) println("grade A1") else
      if (score >= 80 && score <= 89) println("grade A") else
        if (score >= 70 && score <= 79) println("grade B1") else
          if (score >= 60 && score <= 69) println("grade B") else println("second division marks")


    /* as expression */
    var x = if (score >= 90 && score <= 100) "grade A1" else
      if (score >= 80 && score <= 89) "grade A" else
        if (score >= 70 && score <= 79) "grade B1" else
          if (score >= 60 && score <= 69) "grade B" else "second division marks"
    println("x = "+x)

    // multiple statement in if clause and else clause
    var y = 20
    var res1 = 1
    if (y%2==0 && y > 10){
      println("y is greater than 10")
      var res1 = y*y
    }
    else{
      var res1 = y * 2
    }
    println("res1 = " + res1)

    // with expression for multiple statement in if clause and else clause
    // in above case we were separatly defining and initializing res variable

    var res2 = if (y%2==0 && y>10) y*y else y*2
    println("res2 = " + res2)

  }


  def match_func(): Unit = {
    println("Understanding match keyword functionality")
    var x = 13
    x match {
      case 1 => println("Jan")
      case 2 => println("Feb")
      case 3 => println("March")
      case 12 => println("Dec")
      case _ => println("given no. is not correct")
    }

    /*
    Above approach works well only when we have to do comparision on constant values,
    hence this approach will not work when we have to condition like
    greater/lesser/greater than/lesser than
    */

    var score = 60
    score match {
      case score if score >=90  => println("grade A1")
      case score if score >=80 => println("grade A")
      case score if score >=70 => println("grade B1")
      case score if score >= 60 => println("grade B")
      case _ => println("second division")
    }

    /*
     Scenario: we have to store the grade scored in a variable depending of the marks scored
      */

    var grade_scored = score match{
      case score if score >=90 =>"A1"
      case score if score >=80 =>"A"
      case score if score >=70 =>"B1"
      case score if score >=60 =>"B"
      case _ => "second division"
    }

    println("grade_scored "+grade_scored)

    var y = 7
    y match{
      case 1 | 3 | 5 | 7 | 9 => println("It's a odd no.")
      case 2 | 4 | 6 | 8 | 10 => println("It's a event no.")
    }

  }


}
