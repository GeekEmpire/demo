package texta;

public class text18 {
	public static void main(String[] args) {
		System.out.println(addNum(100));
	}
	public static int addNum(int num) {
		if( num==1){ 
			return 1;
		}else { 
			return num+addNum(num-1);
		}
		
	}

}
