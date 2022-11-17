import java.util.*;

public class Main14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num1 = new int[10];

		for (int i = 0; i < num1.length; i++) {
			num1[i] = sc.nextInt();
		}
		sc.close();

//		for (int i = 0; i< num1.length; i++) {
//			System.out.print(num1[i] + " ");	
//		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < num1.length; i++) {
			if (min > num1[i]) {
				min = num1[i];
			}
		}
		System.out.println(min);
	}
}