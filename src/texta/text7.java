package texta;
import java.util.Arrays;
public class text7 {
	 public static void main(String[] args) {
		 text7 hello = new text7();
		int[] nums = hello.getArray(8);
		System.out.println(Arrays.toString(nums)); 
	}
	public int[] getArray(int length) {
        
		int[] nums = new int[length];
        
		for (  int i=0;i<nums.length;i++)                                   {      nums[i]=(int)(Math.random()*100);
            
		nums[i]=(int)(Math.random()*100);
        
		}
		return nums; 
	}

}
