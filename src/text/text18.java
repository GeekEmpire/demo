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
			System.out.println("***�������"+i+"���༶�ĳɼ�***");
			for(int  k=1;k<=stuNum;k++) {
				System.out.println("�������"+k+"��ͬѧ�ĳɼ�");
				int score=input.nextInt(); 
				sum=sum+score;
			}
			avg=sum/stuNum; 
			System.out.println("��"+i+"���༶��ѧ��ƽ���ɼ�Ϊ��"+avg);
			
		}
	}

}
