package scala_oops

case class Employee_caseClass(empname:String, empId:Int, empSal:Int){

}

object Employee_caseClass_1{
  def method1(): Employee_caseClass = {
    load()
  }

  def load(): Employee_caseClass = {
    val name = "ABCD"
    val id = 100
    val sal = 10000
    Employee_caseClass(empname = name, empId = id, empSal = sal)
  }
}