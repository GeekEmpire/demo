package texta;

public class text3 {
	public static void main(String[] args) {
		text3 hello = new text3(); 
        int maxScore=hello.getMaxAge();
		System.out.println("最大年龄为：" + maxScore); 
	}
	public int getMaxAge() {
        int[] scores={18,23,21,19,25,29,17};
        int max=scores[0];
        for(int i=0;i<=6;i++) {
            if(max<scores[i]) {
                max=scores[i];
            }
        }
        return max;
	}

}
