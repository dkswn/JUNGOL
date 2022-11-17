import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String school = sc.next(); // 메서드 괄호 안은 피라미터이고
		int grade = sc.nextInt();
		sc.close();

//		System.out.println("name : " + name);
//		System.out.println("School :" + school);
//		System.out.println("grade : " + grade);

		Student stu = new Student(name, school, grade);  //인스턴스
		stu.print();  // 인스턴스 생성 
	}

}

class Student { // 인스턴스 생성
	private String name;  
	private String school;
	private int grade;

	public Student(String name, String school, int grade) {
		this.name = name; // 매개변수를 대입해줌
		this.school = school;
		this.grade = grade;
	}

	public void print() {
		System.out.println("name :" + name);
		System.out.println("school :" + school);
		System.out.println("grade :" + grade);
	}
}