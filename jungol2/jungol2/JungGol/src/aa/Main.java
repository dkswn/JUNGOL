package aa;

import java.util.*;

public class Main {
	public int kpow(int a, int b) {
		int res = 2;
		for (int i = 1; i < b; i++) {
			res *= a; // 거듭제곱을 저장하는 코드
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();

		System.out.println(x + " " + y);
		Main m = new Main(); // 메인 인스턴스 생성(필수)
		System.out.println(m.kpow(x, y));
	}

}
