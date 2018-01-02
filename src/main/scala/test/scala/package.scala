

package object test {
  object MyObject {
    def method () : Unit = {
      println("method of myobject")
    }
  }
  
  MyObject.method()
  
  val myconst=123
}