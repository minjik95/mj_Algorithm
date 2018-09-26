package kr.ac.ds.sort;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Student[] students = new Student[n];
		
		String name;
		int kor, eng, math;
		for(int i = 0; i < n; i++) {
			name = sc.next();
			kor = sc.nextInt();
			eng = sc.nextInt();
			math = sc.nextInt();
			
			students[i] = new Student(name, kor, eng, math);
		}
		
		Arrays.sort(students);
		
		for(int i = 0; i < n; i++) {
			System.out.println(students[i].name);
		}
	}
}

class Student implements Comparable<Student> {
	String name;
	int kor, eng, math;
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		if(this.kor < s.kor) return 1;
		else if(this.kor > s.kor) return -1;
		else {
			if(this.eng > s.eng) return 1;
			else if(this.eng < s.eng) return -1;
			else {
				if(this.math < s.math) return 1;
				else if(this.math > s.math) return -1;
				else return this.name.compareTo(s.name);
			}
		}
	}
}
