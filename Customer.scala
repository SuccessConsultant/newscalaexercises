package Garage

/**
  * Created by Adedotun Haastrup on 15/06/2017.
  */
case class Customer(cu_id: Int, cu_name: String) extends Person  {
  val id = cu_id
  val name = cu_name
  override def toString: String = s"ID: $id, NAME: $name"
}
