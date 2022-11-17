import java.util.*;

public class Main16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[10];
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt(); // 입력값 받는 for 문
		}
		sc.close();

//		for(int i=0; i<score.length; i++) {
//			System.out.print(score[i] + " ");
//		}

		int max = -1, min = 10000;
		for (int i = 0; i < score.length; i++) {
			if (score[i] > max && score[i] < 100) {
				max = score[i];
			}
			if (score[i] < min && score[i] >= 100) {
				min = score[i];

			}
		}
		if (max == -1) {
			max = 100;
		}
		if (min == 10000) {
			min = 100;
		}
		System.out.println(max + " " + min);

	}

}