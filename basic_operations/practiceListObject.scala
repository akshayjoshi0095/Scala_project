package basic_operations

object practiceListObject {
  def main(args:Array[String]): Unit = {
    println("This is the main function")
    practiceList()
  }

  def practiceList(): Unit = {
    val l:List[Int] = List(1,2,3,25,41,4,5,6,7,8,8,9,10)
    println("list:"+l)

    println("elemenet at 4th index: ", l(4))
    println("position of element 4 in list: "+l.indexOf(4))
    println("count of 8 in the list "+  l.count(_==8))

    println("min val of list " +l.min)
    println("max val of list " +l.max)
    println("sum of element of list " +l.sum)

    println("head of list: " +l.head)
    println("tail of list: " +l.tail)
    print("length of list: " +l.length)
    print("way of fetching last element of the list: "+ l.last)

    // joining operation in list
    val l1:List[String] = List("abc", "def", "ghi", "jkl")
    println(l1)
    println(l1.mkString)



    // way of iterting on list

//    1st way
    for(i <- l){
      print(i)
    }
    println()

//    2nd way
    l.foreach(i => print(i))
    println()

//    3rd way
    for(i <- 0 to l.length-1){print(l(i))}
    println()

    //    4th way
    for (i <- 0 until(l.length)) {
      print(l(i))
    }
    println()

    println("reverse of list: "+l.reverse)
    println("sorting of list: "+l.sorted)

    // in operator in list
    println("in operator in list: " + l.contains(100))
    println("in operator in list: " + l.contains(5))

    if(l==l1){
      println("lists are same")
    }
    else {
      println("lists are not same")
    }

    // concatination
    val l_a : List[Int] = List(101, 102, 103, 104)
    val l_b : List[Int] = List(105, 106, 107, 108)
    val l_c : List[Int] = List(109, 110, 111, 112)
    val l_d :List[Int] = List.concat(l_a,l_b, l_c)
    println("l_d: "+l_d)

    println("is list empty: "+l.isEmpty)
    println("fold_left: "+l.foldLeft(0)(_+_))
    println("fold_right: "+l.foldRight(0)(_+_))

    // sortcut of list creation


  }

}
