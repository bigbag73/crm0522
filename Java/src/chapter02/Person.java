package chapter02;

public class Person {
	public void finalize() {
		System.out.println("������Ϊ�������ա�����");
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
