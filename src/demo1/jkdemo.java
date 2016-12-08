package demo1;

interface USB{ 
	void start ();
	void stop ();
}
class C { 
	public static void  work(USB u) {
		u.start();
		System.out.println("工作中");
		u.stop();
	}
}

class USBDisk implements USB{ 
	public void start() {
		System.out.println("U盘开始工作");
	}
	public void  stop() {
		System.out.println("U盘停止工作");
	}
}

class Printer implements USB{ 
	public void  start() {
		System.out.println("打印机工作");
	}
	public void  stop() {
		System.out.println("打印机停止工作");
	}
}
public class jkdemo {
	public static void main(String[] args) {
		C.work(new USBDisk());
		C.work(new Printer());
		
	}

}
