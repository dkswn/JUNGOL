package Main;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int num1 = scanner.nextInt();
			
			if (num1 % 3 == 0) {
				int red = num1 / 3;
				System.out.println(red);
			} else if (num1 % 3 >= 0) {

			} else if (num1 == -1) {
				break;
			}
		}
		scanner.close();

	}
}
