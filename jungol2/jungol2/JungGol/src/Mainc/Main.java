package Mainc;

import java.util.*;

public class Main {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		for (int i = 0; i < N; i++) {
			for (int j = N; j > i; j--) {
				System.out.print("*");

			}
			System.out.println();
		}
	}
}		//빌어먹을 별찍기