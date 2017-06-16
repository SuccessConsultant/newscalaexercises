package Garage

/**
  * Created by Adedotun Haastrup on 15/06/2017.
  */
class Car(c_id: Int, c_model: String, c_vehicleType: String) extends Vehicle {
  val id = c_id
  val model = c_model
  val vehicleType = c_vehicleType
  override def toString: String = s"ID: $id, Is a car "


}
