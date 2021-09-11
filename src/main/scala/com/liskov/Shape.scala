package com.liskov

trait Shape {
  def calculateArea(shape: Shape): Int
}
