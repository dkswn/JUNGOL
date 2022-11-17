import java.util.*;

public class Main12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//	    int num = 0;
//	    int count = 0;
		int sum = 0;
//		float avg = 0.0f;
		
		double avg;
		do {
			num = sc.nextInt();
			sum += num;
			avg = sum / num;
		} while (num < 100);

//		do {
//	        num = sc.nextInt();
//	        ++count;
//	        sum += num;
//	        avg = (float)sum / (float)count;
//	    } while (num < 100);
	    sc.close();
	    
	    System.out.printf("%d\n%.1f", sum, avg);
	}
}