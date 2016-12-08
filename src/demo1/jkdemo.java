package demo1;

interface USB{ 
	void start ();
	void stop ();
}
class C { 
	public static void  work(USB u) {
		u.start();
		System.out.println("������");
		u.stop();
	}
}

class USBDisk implements USB{ 
	public void start() {
		System.out.println("U�̿�ʼ����");
	}
	public void  stop() {
		System.out.println("U��ֹͣ����");
	}
}

class Printer implements USB{ 
	public void  start() {
		System.out.println("��ӡ������");
	}
	public void  stop() {
		System.out.println("��ӡ��ֹͣ����");
	}
}
public class jkdemo {
	public static void main(String[] args) {
		C.work(new USBDisk());
		C.work(new Printer());
		
	}

}
