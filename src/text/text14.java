package text;

public class text14 {
	 public static void main(String[] args) {

			int sum = 0; // �����ۼ�ֵ

			for (int i = 1; i <= 10; i++) {

				// ���iΪ����,��������ѭ����������һ��ѭ��
				if (     i%2!=0        ) {
					continue;
				}

				sum = sum + i;
			}

			System.out.print("1��10֮�������ż���ĺ�Ϊ��" + sum);
		}

}
