package Garage

/**
  * Created by Adedotun Haastrup on 15/06/2017.
  */
class Bike(b_id: Int, b_model: String, b_vehicleType: String) extends Vehicle {
  val id = b_id
  val model = b_model
  val vehicleType = b_vehicleType
  override def toString: String = s"ID: $id, Is a bike "
}
