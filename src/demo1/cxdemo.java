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
		System.out.println("姓名："+getName()+" 年龄："+getAge()+" 成绩"+getScore());
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
		System.out.println("姓名："+getName()+" 年龄："+getAge()+" 工资"+getMoney());
	}
}

public class cxdemo {
	public static void main(String[] args) {
		Student s=new Student(10, "小明", 100);
		s.want();
		Worker w =new Worker(35, "大明", 1500);
		w.want();
		
		
		
	}

}
