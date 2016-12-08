package text;

public class text16 {
	public static void main(String[] args){
		int num = 999;
		int count = 0;
		if(num>=0&&num<=999999999) {
			while (num!=0) {
		    count++;
		    num/=10;
		}
		 System.out.println("它是个"+count+"位数！");
		}
		 else {
			System.out.println("输入有误");
		}
	}
	}


		


