package Main;

import java.util.*;

public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int num1 = sc.nextInt();

			if (num1 % 3 == 0) {
				int red = num1 / 3;
				System.out.println(red);
			} else if (num1 % 3 >= 0) {

			} else if (num1 == -1) {
				break;
			}
		}
		sc.close();

	}

}
