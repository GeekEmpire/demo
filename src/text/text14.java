package text;

public class text14 {
	 public static void main(String[] args) {

			int sum = 0; // 保存累加值

			for (int i = 1; i <= 10; i++) {

				// 如果i为奇数,结束本次循环，进行下一次循环
				if (     i%2!=0        ) {
					continue;
				}

				sum = sum + i;
			}

			System.out.print("1到10之间的所有偶数的和为：" + sum);
		}

}
