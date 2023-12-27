object First_Program extends App {

//  https://www.youtube.com/watch?v=v_b6DrKp8hM&list=PLat4EDcV8F_KhVdZnFjHhspERzTKgFmOa&index=4
//  class 1-5

//  way of priting statements
//  Difference b/t print() and println()
  print("100")
  println("Understanding print statement in scala")
  print("100")


//  way of defining variables in scala
  val a = 100
  println(a)
  val b = "string"
  println(b)

  // Way of getting the data type of a variable
  println("data type of b:", b.getClass)



//  val a = 200     error : a  is already defined as variable a
//  a = 200     error : reassignment to val a = 200

//  Understanding difference b/t val and var
  var a1 = 200
  println(a1)
  a1 = 300
  println(a1)

  // NOTE : val is immutanble and var is mutable in nature - hence use them wisely

//  Concationation in scala
  println("Concationation in scala")
  val d1 = 10
  val d2 = 20
  val d3 = d1 + d2
  println("d3:",d3)

  val s10 = "100"     // any numerical value defined within the double cots would be considered as string
  val s11 = "200"
  println(s10 + s11 )
  println(s10.toInt + s11.toInt )
  val x11 = s10.toInt + s11.toInt
  println(s"concatination of values $x11" )


  println("Way 1 : String Concationation in scala")
  val s1 = "Akshay"
  val s2 = "-Joshi"
  val s3 = s1 + s2
  println("s3:",s3)

  println("Way 2 : String Concationation in scala")
  val S1 = "Akshay"
  val S2 = "-Joshi"
  println(S1.concat(S2))



//  Data Type Conversion in scala
  println("Implicit Conversion in scala")
  val i1 = 10
  val i2 = "Hello"
  println(i1+i2)


  println("Explicit Conversion in scala")
  val j1 = 10
  val j2 = 20
  println(j1.toString + j2.toString)

  val J1 = "10"
  val J2 = "20"
  println(J1.toInt + J2.toInt)

  //way of defining variables i.e var/val along with data type
  println()
  println("way of defining variables i.e var/val along with data type")
  val z1 : Int = 10
  println(z1, z1.getClass)

  //  notice the cap. case
  val z2: String = "string"
  println(z2, z2.getClass)


  //  Way of identifying data type of a variable
  println()
  println("identifying data type of a variable")
  val y = 100
  //  notice the camel case
  println(y.getClass)
  println(y.getClass.getName)

  val y1 = "string"
  println(y1.getClass)
  println(y1.getClass.getName)


//  Way of identifying the range of any datatype
  println()
  println("Way of identifying the range of any datatype")
  println(Int.MinValue, Int.MaxValue)
  println(Integer.MIN_VALUE, Integer.MAX_VALUE)
  println(Integer.BYTES)
  println(Float.MinValue, Float.MaxValue)


//  way of defining long datatype variable
  println()
  println("way of defining long datatype variable")
  val x = 400l
  println(x)
  print(Long.MinValue, Long.MaxValue)
  println()

  //  way of defining float datatype variable
  println()
  println("way of defining float datatype variable")
  val x1 = 400f
  println(x1)
  print(Float.MinValue, Float.MaxValue)
  println()

  //  way of defining double datatype variable
  println()
  println("way of defining double datatype variable")
  val x2 = 400d
  println(x2)
  print(Float.MinValue, Float.MaxValue)
}


/*
NOTE :
> Scala is written on java
> val is immutanble and var is mutable in nature - hence use them wisely
> println means automatic changeline at the end and print is without automatic changeline at the end
> anything with the cotes is always consider as String data type
> single cots is not valid in scala
> giving semi colon at the end of the satetment is optional

 */
