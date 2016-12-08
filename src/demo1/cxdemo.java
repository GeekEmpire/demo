package demo1;

abstract class Rre{ 
	private int age;
	private String name;
	public Rre(int age,String name) {
		this.age=age;
		this.name = name;
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
	
	public abstract void want();
}

class Student extends Rre{ 
	private int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	public Student( int age,String name,int score) { 
		super(age, name);
		this.score=score;
	}
	public void want() {
		System.out.println("������"+getName()+" ���䣺"+getAge()+" �ɼ�"+getScore());
	}
}

class Worker extends Rre { 
	private int  money;
	public int  getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money=money;
	}
	
	public Worker (int age,String name,int money) {
		super(age, name);
		this.money=money;
	}
	public void want() {
		System.out.println("������"+getName()+" ���䣺"+getAge()+" ����"+getMoney());
	}
}

public class cxdemo {
	public static void main(String[] args) {
		Student s=new Student(10, "С��", 100);
		s.want();
		Worker w =new Worker(35, "����", 1500);
		w.want();
		
		
		
	}

}
