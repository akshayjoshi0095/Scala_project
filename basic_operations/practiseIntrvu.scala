package basic_operations

import scala.collection.mutable.ListBuffer

object practiseIntrvu {
    def main(args:Array[String]): Unit = {
      println("execution started")
      val x = sumVal(10,20,30)
      println("sum is: "+x)
      val y = isBalanced("[]{([])}[(])")
      println("status is: "+y)
    }

  def sumVal(v1:Int, v2:Int, v3:Int): Int = {
    return v1+v2+v3
  }

  def isBalanced(give_expession:String): String = {
    if (give_expession==""){
      return "give expression is empty"
    }
    else {
      val lb = new ListBuffer[Char]()
      val x:List[Char] = List('[', '{','(')
      for(i <- give_expession){
        if(x.contains(i)){
          lb.append(i)
        }
        else{
          i match {
            case i if i == ']' && lb(lb.length-1) == '['  => lb.remove(lb.length-1)
            case i if i == '}' && lb(lb.length-1) == '{'  => lb.remove(lb.length-1)
            case i if i == ')' && lb(lb.length-1) == '('  => lb.remove(lb.length-1)
            case _ => return "not balanced"
          }
        }
      }
      if (lb.length == 0){
        return "Balanced"
      }
      else {
        return "not balanced"
      }
    }
  }


}
