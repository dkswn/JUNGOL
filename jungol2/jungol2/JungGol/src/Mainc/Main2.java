package Mainc;
import java.util.Scanner;
public class Main2 {
	public static void printStr() {    // 메서드(함수) 구현부
		System.out.println("~!@#$^&*()_+|");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			printStr(); // 호출된 메서드 값  (호출부) 
//			System.out.println(num);
		}
		sc.close();
	}

}
