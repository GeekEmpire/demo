package text;
import java.util.Scanner;
public class text17 {
	 public static void main(String[] args) {
	     Scanner input=new Scanner(System.in);   
	        // ��������ɼ�
	     System.out.println("�����뿼�Գɼ���");//println���У�print������
	        int score = input.nextInt(); 
	        
	        // ��������ӷִ���
	        int count = 0;


	        //��ӡ����ӷ�ǰ�ɼ� 
	        System.out.println("�ӷ�ǰ�ɼ�:"+score) ;
	       
	        
	        // ֻҪ�ɼ�С��60����ѭ��ִ�мӷֲ�������ͳ�Ƽӷ�         
	        for (;score<60;score++) {
	        
	        count++;  }
	        System.out.println("������"+count+"��!");
	        System.out.println("�ӷֺ�ĳɼ���");
	        



	    }
	

}
