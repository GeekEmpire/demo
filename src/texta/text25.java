package texta;

class Personr{
	private int  age;
	public String name;
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
//	public void  tell() {
//		System.out.println("姓名："+getName()+"年龄："+getAge());
//	}
//	
}	
class studens extends Personr{
//	private int age;
//	private  String name;
	private int scores;
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public int getScores() {
		return scores;
	}
	public void setScores(int scores) {
		this.scores = scores;
	}
	public void say() {
		System.out.println("成绩："+getScores()+"\n"+"年龄："+getAge()+"\n"+"姓名："+getName());
	}
}



public class text25 {
	public static void main(String[] args) {
		studens s=new studens();
		s.setAge(20);
		s.setName("zhangsan");
		s.setScores(100);
		s.say();
	}

}
