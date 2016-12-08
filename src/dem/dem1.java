package dem;

class A{
	private int age;
	private String name;
	public void  tell() {
		System.out.println("wswsw");
	}
	
}
class B extends A	{ 
	public  void tell() {
		
		System.out.println("我重写了tell方法");
	}
	void sau () {
		
	}
}

public class dem1 {
	public static void main(String[] args) {
		B b  =new B();
		b.tell();
		
	}

}
