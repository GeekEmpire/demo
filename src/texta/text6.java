package texta;

public class text6 {
	 public static void main(String[] args) {

			// ��������
		 text6 hello = new text6();

			// �����޲εķ���
			hello.print();

			// ���ô���һ���ַ��������ķ���
		    hello.print("imooc");

			// ���ô���һ�����Ͳ����ķ���
		    hello.print(18);
		}

		public void print() {
			System.out.println("�޲ε�print����");
		}

		public void print(String name) {
			System.out.println("����һ���ַ���������print����������ֵΪ��" + name);
		}

		public void print(int age) {
			System.out.println("����һ�����Ͳ�����print����������ֵΪ��" + age);
		}

}
