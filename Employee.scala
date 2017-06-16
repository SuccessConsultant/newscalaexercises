package Garage

/**
  * Created by Adedotun Haastrup on 15/06/2017.
  */
case class  Employee(id: Int, name: String) extends Person {

  override def toString: String = s"ID: $id, NAME: $name"


}
