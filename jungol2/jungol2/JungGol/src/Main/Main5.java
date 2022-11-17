package Main;

import java.util.*;

public class Main5 {
	 
		public int maxFunc(int[] ar) {
			int max = -1;
			for(int i=0; i < ar.length; i++) {
				if (max <ar[i]) {
						max = ar[i];
				}
			}
			return max;
		}

	

	public static void Main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.printf("%s%s%s%n", a, b, c);

	}
}
