package texta;

import java.awt.HeadlessException;

public class text11 {
	String name;
	String sex; 
	static int age ;
	public text11() {
	  System.out.println("通过构造方法初始化name"); 
	  name ="tom"; 
		
	}
	{ 
		System.out.println("通过初始化块初始化age"); 
		sex="男";
		
	}
	static { 
		System.out.println("通过静态初始化块初始化"); 
		age=20; 
		
	}
	public void show() {
		System.out.println("姓名："+name+",性别："+sex +"，年龄："+age );
		
		
		
	}
	public static void main(String[] args) {
		text11 hello= new text11();
		hello.show();
		
	}

}
