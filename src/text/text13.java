package text;

public class text13 {

	    public static void main(String[] args) {
			
			// �����ۼ�ֵ
			int sum = 0;
			
			// ��1ѭ����10
			for (int i = 1; i <= 10; i++) {
				
				// ÿ��ѭ��ʱ�ۼ����
				sum = sum + i;
				
				// �ж��ۼ�ֵ�Ƿ����20����������������˳�ѭ��
				if (        sum>20      ) {
					
					System.out.print("��ǰ���ۼ�ֵΪ:" + sum);
					break;
					//�˳�ѭ��
					
				}
			}
		}
	

}
