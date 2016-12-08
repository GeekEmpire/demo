package texta;

class Dem{ 
	int age;
	public int  getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
}
class Worker extends Dem {
	public void  tell() {
		System.out.println(getAge());
	}
	
}
//class Offf extends Worker{ 
//	public void  tell() {
//		System.out.println(age);
//	}
//	
//}

public class text26 {
	public static void main(String[] args) {
		Worker w= new Worker();
		w.setAge(100);
		w.tell();
		
	}

}
