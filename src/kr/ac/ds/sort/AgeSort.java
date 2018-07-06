package kr.ac.ds.sort;

import java.util.Arrays;
import java.util.Scanner;

public class AgeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int age = 0;
		String name = null;
		
		Person[] person = new Person[n]; 
		for(int i = 0; i < n; i++) {
			age = sc.nextInt();
			name = sc.next();
			person[i] = new Person(age, name);
		}
		
		Arrays.sort(person);
		
		for(int i = 0; i < n; i++) {
			System.out.println(person[i].age + " " + person[i].name);
		}
	}

}

class Person implements Comparable<Person> {
	int age = 0;
	String name = null;
	
	Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Person p) {
		// TODO Auto-generated method stub
		if(this.age > p.age) return 1;
		else if(this.age < p.age) return -1;
		else return 0;
	}
}
