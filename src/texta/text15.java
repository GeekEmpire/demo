package texta;

import org.w3c.dom.NameList;

class People{
	//���췽��
	int age;
    String name ; 
	public People(int a,String n) {
	    age= a;
		name= n;
		System.out.println("������"+name+" "+"���䣺"+age );
	}
	public People(int a) {
		age=a;
		System.out.println("���䣺"+age);
	}
}

public class text15 {
	public static void main(String[] args) {
		People per = new People(15,"����");
		People per1=new People(24);
	}
	

}
