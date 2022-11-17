package Main;

import java.util.*;

 class Student {
		private String schoolname;   // 인스턴스 생성 
		private int grade;
		
public void setSchoolname(String Schoolname) {
	this.schoolname=Schoolname;
}
public void setGrade(int grade) {
	this.grade=grade;	
}
public void print() {
	System.out.println(grade + schoolname);
	}
 }
 public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		Student stu1 = new Student();
		stu1.setSchoolname("Jejuelementary");
		stu1.setGrade(6);
		
		String schoolname = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
		Student stu2 = new Student();
		stu2.setSchoolname(schoolname);
		stu2.setGrade(grade);
		
		stu1.print();
		stu2.print();
	}

}
