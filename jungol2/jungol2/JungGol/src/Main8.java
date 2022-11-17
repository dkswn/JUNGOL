import java.util.*;

public class Main8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char w[] = new char[100];

		for (int i = 0; i < w.length; i++) {
			w[i] = sc.next().charAt(0);

		}
		System.out.printf("%c %c %c", w[0], w[3], w[6]);
		sc.close();
	}

}
