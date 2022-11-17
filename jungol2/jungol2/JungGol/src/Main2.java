import java.util.*;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int num1 = sc1.nextInt();
		int num2 = sc1.nextInt();
		sc1.close();
		
		int org = num1++;
		int org1 = --num2;
		int org2 = org * org1;
		
		
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");	
		System.out.print(org2 + " ");
	}
}