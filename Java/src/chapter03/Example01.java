package chapter03;
class Animal {
	String name="����";
	public void shout() {
	System.out.println("���﷢������");
	}
}
class Dog extends Animal{
	String name ="Ȯ��";
	public void shout() {
		super.shout();
	}
		public void printName() {
			System.out.println("name="+name);//���name��Ϊsuper.name����ø���name����
		}
	}

public class Example01 {
	public static void main(String[] args) {
	Dog dog=new Dog();
	dog.shout();
	dog.printName();
	}
}
