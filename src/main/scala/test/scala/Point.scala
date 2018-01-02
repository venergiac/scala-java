package test.scala

//y and z are optional
class Point(var x: Int, var _y: Int = 0, var _z: Int = 0) {

  //x is public by default
  
  //y is public it defines a "set" method 
  def y=_y
  
  def y_= (value: Int) : Unit = {
    println("y call")
    _y = value
  }
  
  //z is private and it defines a "set" method 
  private def z=_z;
  
  def z_= (value: Int) : Unit = {
    println("z call")
    _z = value
  }
  
  
  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    _y = y + dy
  }

  override def toString: String =
    s"($x, $y)"
}