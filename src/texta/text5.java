package texta;
import java.util.Arrays;
public class text5 {
	public static void main(String[] args) {
		text5 hello = new text5();
		int[] scores={79,52,98,81};
        
		//���÷���������ɼ����飬����ȡ�ɼ��ĸ���
		int count=hello.sort(scores);
        
		System.out.println("����"+count+"���ɼ���Ϣ��");
	}
    
	/*
	 * ���ܣ������Գɼ�������������سɼ��ĸ���
	 * ����һ������������������ķ���������ɼ�����
	 * ʹ��Arrays��Գɼ���������������
	 * ����ִ�к󷵻�������Ԫ�صĸ���
	 */
	public int sort( int[] scores ){
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		
        //����������Ԫ�صĸ���
        return  scores.length;
	}

}
