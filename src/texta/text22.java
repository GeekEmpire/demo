package texta;

class People23 {
	private String name ;
	public int  age;
	public People23(String name,int age){
		this();
		this.name=name;
		this.age=age;
	}
	public People23() {
		System.out.println("�޲κ������췽��");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void  tell() {
		System.out.println("������"+this.getName()+"  ���䣺"+this.getAge());
		
	}	
	
}

public class text22 {
		public static void main(String[] args) {
			People23 p=new People23("����",30);
			p.tell();
			
		}
}
