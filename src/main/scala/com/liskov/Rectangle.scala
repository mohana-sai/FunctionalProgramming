package com.liskov
case class Rectangle(length: Int, width: Int) extends Shape {

  override def calculateArea(rectangle: Shape): Int = length * width

}
