package texta;

import java.awt.HeadlessException;

public class text11 {
	String name;
	String sex; 
	static int age ;
	public text11() {
	  System.out.println("ͨ�����췽����ʼ��name"); 
	  name ="tom"; 
		
	}
	{ 
		System.out.println("ͨ����ʼ�����ʼ��age"); 
		sex="��";
		
	}
	static { 
		System.out.println("ͨ����̬��ʼ�����ʼ��"); 
		age=20; 
		
	}
	public void show() {
		System.out.println("������"+name+",�Ա�"+sex +"�����䣺"+age );
		
		
		
	}
	public static void main(String[] args) {
		text11 hello= new text11();
		hello.show();
		
	}

}
