package texta;

class Father{
	private int age;
	private String name;
	
	public Father() {
		System.out.println("����Ĺ��췽��");
	}
}
class Son extends Father{ 
	public Son  () {
		System.out.println("����Ĺ��췽��");
	}
}

public class text27 {
	public static void main(String[] args) {
		Son s=new Son();
	}
	

}
