package aa;

import java.util.*;

 class Student {
	private String name;
	private int kor;
	private int eng;
	
	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	public void print() {
		System.out.println(name + " " + kor + " " + eng);
	}
	public int getkor() {
		return kor;
	}
	public int geteng() {
		return eng;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] stu = new Student[2];
		for(int i=0; i<stu.length; i++) {
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			stu[i] = new Student(name,kor,eng);
		}
		sc.close();
		for(int i = 0; i<stu.length; i++) {
			stu[i].print();
		}
		int sumkor = 0;  int sumeng = 0;
		for(int i =0; i< stu.length; i++) {
			sumkor += stu[i].getkor();
			sumeng += stu[i].geteng();
		}
		System.out.println("avg" + sumkor / stu.length + " " + sumeng / stu.length);
	}
	
	

}
