package texta;

class Person{ 
	private int age; 
	private String name;
	
	/*public int  getAge() {
		return age; 	
	}
	public void  setAge(int a) {
		if (a>=0&&a<150) {
			
		age=a;
		}
	}
	public String getName () {
		return name;
	}
	public void setName(String name) {
		this.name=name;
		
	}*/
	
	
	public void tell() {
		System.out.println("年龄:"+age+" "+"姓名："+name);
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}
	
public class text13 {
	public static void main(String[] args) {
		Person per = new Person();
		per.setAge(30);
		per.setName("张三");
		per.tell(); 
	}

}
