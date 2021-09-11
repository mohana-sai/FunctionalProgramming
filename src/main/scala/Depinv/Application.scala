package Depinv

object Application extends App {


  val electricSwitch = (client: Switch) => {
    if (client.isOn) {
      println(client.name + " is off")
      client.isOn = false
    }
    else {
      println(client.name + " is On")
      client.isOn = true
    }
  }
  val bulbSwitch = new Switch {
    override var isOn: Boolean = false
    override var name= "Bulb"
  }
  electricSwitch(bulbSwitch)
  electricSwitch(bulbSwitch)

  println()
  val fanSwitch = new Fan
  electricSwitch(fanSwitch)
  electricSwitch(fanSwitch)
}
