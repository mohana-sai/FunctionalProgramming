package com.liskov

object Lsvmain extends App {
  val rectangleArea = (length: Int, width: Int) => length * width
  println(rectangleArea(2334, 2535))

  val squareArea = (length: Int, width: Int) => length * width
  println(squareArea(56, 70))

  val rectangle = Rectangle(20, 15)
  println(rectangle.calculateArea(rectangle))
}
