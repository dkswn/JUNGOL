
public class Main13 {
	public static void main(String[] args) {

		int[] score1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // 선언과 동시에 생성
		
		for (int i = 0; i < score1.length; i++) { 	// 생성된 길이 만큼 for문을 이용하여 출력
			System.out.print(score1[i] + " ");
		}
		
		int score2[] = new int[10];				//배열의 길이 선언
		int[] score3 = {1,2,3,4,5,6,7,8,9};
		for (int i =0; i<score3.length; i++) {  // for문을 이용하여 배열 출력
			System.out.print(score3[i] + " ");
		}
	}
}