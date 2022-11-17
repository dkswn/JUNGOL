import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tmp = 0;
		do {
			System.out.print("ASCII code =?");
			tmp = sc.nextInt();
			if (tmp < 33 || tmp > 127) {
				break;
			}
			System.out.printf("%c\n", tmp);
		} while (33 <= tmp && tmp <= 127);
		sc.close();

	}
}