package Main;

import java.util.Scanner;

class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		sc.close();

		System.out.println(Math.abs(num - num1));
//		
//		if (num1 > num)  {
//			System.out.println(num1 - num);
//		} else  {
//			System.out.println(num - num1);
//		}		
//		System.out.println();
	}
}
