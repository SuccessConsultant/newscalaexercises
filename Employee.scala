package Garage

/**
  * Created by Adedotun Haastrup on 15/06/2017.
  */
case class  Employee(emp_id: Int, emp_name: String) extends Person {
  val id = emp_id
  val name = emp_name

  override def toString: String = s"ID: $id, NAME: $name"


}
