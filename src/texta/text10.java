package texta;

public class text10 {
	static int score1 = 86;
    // 定义静态变量score2
	 static         int score2 = 92; 

    // 定义静态方法sum，计算成绩总分，并返回总分
	public  static  int sum() { 
      
      return score1+score2;
      
	}

	public static void main(String[] args) {
        
        // 调用静态方法sum并接收返
		int allScore = text10.sum();
        
		System.out.println("总分：" + allScore);
	}

}
