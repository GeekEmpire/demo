package texta;

class People1 { 
	int age;
	String name;
	public People1(int a,String n){
		System.out.println("hello world");
		age=a;
		name=n;
		System.out.println("姓名："+name+" "+"年龄:"+age);
	}
}

public class text17 { 
	public static void main(String[] args) {
		People1 per=new People1(23,"张三");
		
	}

}
