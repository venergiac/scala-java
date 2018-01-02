

object MainScala extends App {
  val point = new test.scala.Point(1)
  //point.z=100; z is private
  
  point.x = 100
  println(point.x)
  
  point.y=100
  println(point.y)
  
  val book = new test.scala.Book("abcdefg")
  println(book)
  val book2 = new test.scala.Book("abcdefg")
  println(book==book2)
  println(book.equals(book2))
  val book3 = new test.scala.Book("abcdefg","Scala")
  println(book==book3)
  println(book.equals(book3))
  
  
  class Bark {}
	class Dog(val name : String = "Scala Dog without name") extends test.scala.Pet[Bark] {
	  override def apply(c:Bark) : Unit = {
			System.out.println(c);			
		}
	}
	
	val dog = new Dog()
	println(dog.apply(new Bark()))
  
	class SpeedyDog(val name : String = "Scala Dog without name") extends test.scala.Pet[Bark] with test.scala.Breathe {
	  override def apply(c:Bark) : Unit = {
			println(c);			
		}
	}
	
	val dog2 = new SpeedyDog()
	println(dog2.apply(new Bark()))
	dog2.breathe()
	
	

	test.scala.MyDog.wagtail()
	val mydog = test.scala.MyDog
	mydog.wagtail()
	
	println(test.myconst)
}