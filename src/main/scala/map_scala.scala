object map_scala {

  def main(args:Array[String]): Unit = {
    val map_v = Map("Akshay" -> "Uttarakhand", "Yash" -> "UP", "Varsh" -> "Karnataka", "Kushboo" -> "Haryana",
      "Yash" -> "Uttar Pradesh")
    println(map_v)
    println("Akshay's native", if(map_v.contains("Akshay")) map_v("Akshay") else "None")
    println("Varsha's native", if(map_v.contains("Varsha")) map_v("Varsha") else "None")
    println("Satvisha's native", if(map_v.contains("Satvisha")) map_v("Satvisha") else "None")

    println("map_v.isempty:", map_v.isEmpty)
    println("map_v.keys:", map_v.keys)
    println("map_v.values:", map_v.values)

    println("for loop over map")
    map_v.keys.foreach{
      key => println("key:", key);
        println("value:", map_v(key))
    }

//    val l = List("ctv_convertion_ratio_by_ip", "ctv_convertion_ratio_by_hh", "linear_convertion_ratio_by_ip")
//    println("l1 : ", l)
//    println(l.getClass.getName)
//    println("understand: ",l.toArray)
//    println("l2 : ", l)
//    println(l.getClass.getName)
//    println("understand: ", l.toArray.map(_.toString))
//    println("l3 : ", l)
//    println(l.getClass.getName)

//    println("understand:", l.toArray.map(_.toString).toList)

//    map_v["Bishwa"] = "Odisa"
//    println(map_v)
//    map_v("Yash") = "Uttar-Pradesh"
//    println(map_v)
  }

}


/*

Map in scala is same like dictionary in python
> here Map can be muttable and non muttable
> default is immutable

 */