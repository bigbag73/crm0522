package chapter03;
class Animal {
	String name="动物";
	public void shout() {
	System.out.println("动物发出叫声");
	}
}
class Dog extends Animal{
	String name ="犬类";
	public void shout() {
		super.shout();
	}
		public void printName() {
			System.out.println("name="+name);//如果name改为super.name则调用父类name动物
		}
	}

public class Example01 {
	public static void main(String[] args) {
	Dog dog=new Dog();
	dog.shout();
	dog.printName();
	}
}
