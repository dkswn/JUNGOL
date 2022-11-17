import java.util.*;

public class Main10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] z = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };
		int y = sc.nextInt();
		int x = sc.nextInt();

		sc.close();

		double c = z[y - 1] + z[x - 1];
		System.out.printf("%.1f\n", c);
//		double c = z[0] + z[2];
//		System.out.print(c);
	}

}