package demo1;


class A{ 
	public void tell1() {
		System.out.println("A-tell1");
	}
	public void  tell2() {
		System.out.println("A-tell2");
	}
}

class B extends A { 
	public void  tell1() {
		System.out.println("B-tell1");
	}
	public void tell3() {
		System.out.println("B-tell3");
	}
}

public class insdemo {
	public static void main(String[] args) {
		//����ת��
//		B b= new B ();
//		A a=b;
//		a.tell1();
//		a.tell2();
//		//����ת��
//		A a=new B();
//		B b= (B)a;
//		b.tell1();
//		b.tell2();
//		b.tell3();
//		
		A a=new A();
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		
		A a1 = new B();
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		
		
	}
	

}



