package texta;

class Exc{ 
	int i=10; 
}

public class text16 {
	public static void main(String[] args) {
//		Exc e= null;
//		e = new Exc();
//		System.out.println(e.i);
	int a=10;
	int b=0;
	int temp=0;
	try {
		temp =a/b;
	} catch (ArithmeticException e) {
		System.out.println(e);
	} 
	System.out.println(temp);
	}
	
}
 