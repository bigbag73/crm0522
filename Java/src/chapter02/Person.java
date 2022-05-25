package chapter02;

public class Person {
	public void finalize() {
		System.out.println("对象作为垃圾回收。。。");
	}
	public static void main(String[]args)throws Exception {
		Person p1=new Person();
		Person p2=new Person();
		p1=null;
		p2=null;
		System.gc();
		Thread.sleep(5000);;
	}

}
