package text;

public class text12 {
	public static void main(String[] args) {
		int sum = 0; // ���治�ܱ�3��������֮��
		
		// ѭ������ i ��ʼֵΪ 1 ,ÿִ��һ�ζԱ����� 1��ֻҪС�ڵ��� 100 ���ظ�ִ��ѭ��
		for (int i = 1;i<=100 ;i++) {
			
			// ���� i �� 3 ������ģ��ȡ�ࣩ����������� 0 �����ʾ���ܱ� 3 ����
			if (i % 3 != 0) { 
				sum = sum + i; // �ۼ����
			}
		}
		
		System.out.println("1��100֮�䲻�ܱ�3��������֮��Ϊ��" + sum);
	}

}
