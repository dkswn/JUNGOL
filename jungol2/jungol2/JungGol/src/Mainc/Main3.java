package Mainc;

import java.util.*;

public class Main3 {   // 메서드
	int count = 0;  // 클래스의 멤버변수

	void abc(int a) {
		for (int i = 0; i <= a; i++) {    // 포문을 하나만 사용해서 4 *4를 포문에 넣어줌
			for (int j = 0; j <= a; j++) {
				count++;
				System.out.print(count + " ");
			}

			System.out.println(); // 칸을 내리는 기능
		}
	}

	public static void main(String[] args) { // 메서드
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		Main3 ma = new Main3();  // 
		
		ma.abc(a);
	}

}
// public int[][] arrPrint(int inp) // arrprint라는 변수에서int[][]리턴된다라는
// 스캐너도 멤버변수로 가능