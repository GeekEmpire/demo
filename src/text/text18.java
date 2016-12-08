package text;
import java.util.Scanner;
public class text18 {
	
	public static void main(String[] args) {
		int classNum=3;
		int stuNum=4; 
		double sum=0; 
		double avg=0;
		Scanner input=new Scanner(System.in);
		for(int i=1;i<=classNum;i++) {
			sum=0;
			System.out.println("***请输入第"+i+"个班级的成绩***");
			for(int  k=1;k<=stuNum;k++) {
				System.out.println("请输入第"+k+"个同学的成绩");
				int score=input.nextInt(); 
				sum=sum+score;
			}
			avg=sum/stuNum; 
			System.out.println("第"+i+"个班级的学生平均成绩为："+avg);
			
		}
	}

}
