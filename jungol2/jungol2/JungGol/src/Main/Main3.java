package Main;

import java.util.Scanner;

public class Main3 {  
	public static double call(int num) {
		return num * num * 3.14;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		System.out.printf("%.2f", call(num));
	}

}
