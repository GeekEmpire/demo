package texta;

public class text4 {
	 public static void main(String[] args) {
	        
			// 创建对象，对象名为hello
		 text4 hello = new text4();
			
	        // 调用方法，传入两门课程的成绩
			hello.calcAvg(94,81);
		}

		/*
		 * 功能：计算两门课程考试成绩的平均分并输出平均分
		 * 定义一个包含两个参数的方法，用来传入两门课程的成绩
		 */
	     public void calcAvg(int num1,int num2) {
	         double  num3=(num1+num2)/2.0;
	         System.out.println("平均分:"+num3);
	        
	     }


}