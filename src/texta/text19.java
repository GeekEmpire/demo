package texta;

class Ref1{ 
	int temp=10;
}

public class text19 {
	public static void main(String[] args) {
		Ref1 r1=new Ref1();
		r1.temp=20;
		System.out.println(r1.temp);
		tell(r1);
		System.out.println(r1.temp);
	}
	public static void tell(Ref1 d2) {
		d2.temp=30;
		
	}

}
