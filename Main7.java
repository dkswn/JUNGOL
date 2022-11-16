import java.util.*;

public class Main7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char w[] = new char[10];
		
		
		for (int i = 0; i < 10; i++) {
//			char w1 =sc.next().charAt(0);
//			w[i] = w1;
			w[i] = sc.next().charAt(0);
		}
		sc.close();
		for(int i = 0; i<10;i++) {
			System.out.print(w[i]);
		}
	}

}
