package texta;

public class text2 {
	
	    
	    public static void main(String[] args) {
	        
			// ������Ϊhello�Ķ���
	    	text2 hello = new text2();
	        
			// ����hello�����calcAvg()��������������ֵ�����ڱ���avg��
			double avg = hello.calcAvg();
	        
			System.out.println("ƽ���ɼ�Ϊ��" + avg);
		}

		// ����һ������ֵΪdouble���͵ķ���
		public   double       calcAvg() {
	        
			double java = 92.5;
			double php = 83.0;
			double avg = (java + php) / 2; // ����ƽ��ֵ
	        
			// ʹ��return����ֵ
	        return avg;
	        
		}
	}


