package basic_operations

import scala.collection.mutable.ListBuffer

/*
Fundamental diff b/t a list and array
> Array represent a flat list whereas list represent a link list in scala
> Array are mutable and list are immutanble in scala.

Con concept
Nil concept
buffer list

## Way of creating a list
> val l : List[Int] = List(1,2,3,4,5,6,7,8,9)

## Way of fectching element of specific index
> println(l(3))


## Con concept in list
> used for appendding some element to a list and create a new list


## Nil concept of list

## head and tail

isEmpty
reverse
List.fill(5)("Joshi")
max,min, sum
foldLeft, foldRight



## Actions in listBuffer
> dynamic increase
> append
> prepend
> insert
> finding index specific element
> extrcting specific position element
> adding a sequence into a list
> removing element
> updating element
> converting listBuffer into list


 */

object listScala {
  val my_list: List[Int]=List(10,9,8,7,6,5,4,4,4,3,2,1)
  def main(args:Array[String]): Unit = {
    println("Understanding list in scala.")
//    tempFunc()
    tempListBuffer()
  }

  def tempFunc(): Unit = {
    println("This is temp function.")
    println("created list:", my_list)
    println(my_list(3)) // fetching specific index element from a list
    val new_list: List[Int] = 11 :: 12 :: 13 :: my_list  // This is con concept
    println("new list :", new_list)
    println(Nil, Nil.getClass)
    println(0 :: 1 :: 2 :: Nil)

    for (i <- my_list){
      println(i)
    }
    println()
    val sum : Int = 5;
    my_list.foreach(ele => println(ele));

    println()
    println(my_list.foldLeft(0)(_+_))
    println(my_list.foldRight(0)(_+_))

    println(List.fill(10)("Joshi"))

    println("head:",my_list.head, "tail:",my_list.tail)
    val x:List[Int] = my_list.tail
    println(x, x.getClass)
    println(x.min, x.max, x.sum)
    println("reverse:", my_list.reverse)
    println("len:", my_list.length)
    println("at specific index:", my_list.indexOf(8))
    println("count of element", my_list.count(_==4)) // way of finding occurance of an element
    println(my_list.sorted)
    val my_list2 :List[Int] = List(20,19,18,17,16)
    val list3: List[Int] = List.concat(my_list2,my_list)
    println("list3:", list3)

  }

  def tempListBuffer(): Unit = {
    val name = new ListBuffer[String]()
    name += "Alpha"
    name += "Beta"
    name += "Charlie"
    name += "Delta"
    println("created listbuffer: "+name)
    println("dataType of listbuffer "+name.getClass)
    println("way of fetching value: "+name(2))
    println(name.indexOf("charlie"))  // case sensitive
    println(name.indexOf("Charlie"))
    name += "Aplha"
    name.append("Zeta")
    name.prepend("Charlie")
    println("created listbuffer: "+name)
    name ++= Seq("a", "b", "c")
    println("created listbuffer: "+name)
    name.insert(2,"Xray")
    println("created listbuffer: "+name)
    name -= "Charlie"
    println("created listbuffer: "+name)
    name.update(1,"xray")
    println("created listbuffer: "+name)

    val l = List(10,20,30,40,50,60)
    println("val of l: "+ l)
    println(l.getClass)
    println(l(2))
//    for(i <- 0 until(l.length)){
//      println(i)
//    }
    val lb = new ListBuffer[Int]()
    for (i <- 0 until l.length){
      lb.append(l(i))
    }
    println("lb: "+lb)

//    for(i <- l) lb+= i+1
    for(i <- l) lb.append(i+1)
    println("lb: "+lb)
  }
}
