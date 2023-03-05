package chap05sjw.src.a.b.c;

public class ShallowTest {

	public static void main(String[] args) {
		Person original = new Person("John", 30);
	    Person shallowCopy = original;

	    System.out.println("Original: " + original.name + ", " + original.age);
	    System.out.println("Shallow Copy: " + shallowCopy.name + ", " + shallowCopy.age);

	    original.name = "Jane";
	    System.out.println("Original: " + original.name + ", " + original.age);
	    System.out.println("Shallow Copy: " + shallowCopy.name + ", " + shallowCopy.age);
	  
	}

}
class Person {
	  String name;
	  int age;

	  public Person(String name, int age) {
	    this.name = name;
	    this.age = age;
	  }
	}
