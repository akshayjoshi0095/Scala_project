package basic_operations

object stringObj {
  def main(args: Array[String]): Unit = {
    println("Started")
    val name = "Akshay"
    val objective = "learning Scala"

    //    string interpolation
    println(name + " is " + objective)
    println(s"$name is $objective")
    println(f"$name%s is $objective%s")

  }


}
