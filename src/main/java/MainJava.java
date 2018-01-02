

public class MainJava {

	public static void main(String[] args) {
		
		//call scala from java
		test.scala.Point sPoint = new test.scala.Point(0,0,0);
		
		sPoint.x_$eq(100);
		System.out.println(sPoint.x());
		sPoint.y_$eq(100);
		System.out.println(sPoint.y());
		
		//call case class from java
		test.scala.Book book = new test.scala.Book("abcdefg",null);
		System.out.println(book);
		test.scala.Book book2 = new test.scala.Book("abcdefg",null);
		System.out.println(book == book2);
		System.out.println(book.equals(book2));
		test.scala.Book book3 = new test.scala.Book("abcdefg","Scala");
		System.out.println(book == book2);
		System.out.println(book.equals(book3));
		
		
		//call trait from java
		test.scala.Pet<Bark> pet = new Dog();
		pet.apply(new Bark());
		
		
			
		SpeedyDog dog2 = new SpeedyDog();
		dog2.apply(new Bark());
		dog2.breathe();
		
		test.scala.MyDog.wagtail();
		
	}
}

class Bark {
}

class Dog implements test.scala.Pet<Bark> {

	@Override
	public void apply(Bark c) {
		System.out.println(c);
	}

	@Override
	public String name() {
		return "I'm a java dog without a name";
	}

}

class SpeedyDog implements test.scala.Pet<Bark>, test.scala.Breathe {
	@Override
	public void apply(Bark c) {
		System.out.println(c);
	}

	@Override
	public String name() {
		return "I'm a java dog without a name";
	}
}
