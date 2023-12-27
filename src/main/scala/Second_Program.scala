object Second_Program extends App {
  // class 6-10
  // different ways of interpolations
  val x = 100
  println(s"value of x is $x")


  val x1 = "scala"
  println(s"understanding $x1")
  println("understanding " + x1)
  val x2 = "learning"
  println(s"doing $x2 of $x1")

  // way of rounding off the float variable value
  val b = 85.123456
  val c = b
  println(s"value of c is $c")
  println(f"value of c is $c%.3f")

  // understanding concept of raw
  println("Hello \n akshay")
  println(raw"Hello \n akshay")


  // understanding comparision in scala
  println()
  println("understanding comparision in scala : return type of camparision operator is always Boolean")
  val z1 = 10
  val z2 = 10
  val z3 = 20
  println(z1==z2)
  println(z1==z3)
  println(z1!=z3)



  // understanding the concept of if-else
  println("\n \n")
  println("understanding the concept of if-else")
  if (100 > 50)
    println("This is true part")
  else
    print("This is False part")


  // there is a catch is scala for multilines in if block and else block, we have to use curly braces {}
  println("\n \n")
  if (100 > 50) {
    println("This is true part")
    var i = 50
    var i1 = 100
    println(i + i1)
  }
  else
    print("This is False part")


  println("\n \n")
  /// and(&&) or(|) operator
  if (100>50 && 10 < 50) {
println("true part")
println("multiple operation under if block")
  }

  println("\n \n")
  if (100 < 50 | 10 > 50) {
    println("true part")
    println("multiple operation under if block")
  }
  else
    println("its false part")


  println("\n \n")
  /// if-else with elseif
  var z = 34
  if (z >= 90)
    println("excelent")
  else if (z >= 80)
    println("very good")
  else if (z >= 70)
    println("good")
  else if (z >= 60)
    println("normal")
  else if (z >= 50)
    println("low")
  else if (z >= 40)
    println("very low")
  else
    println("fail")


  val l = List

}
