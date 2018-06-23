package kr.ac.ds.math;

import java.util.Scanner;

public class RadixTransformation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int b = sc.nextInt();
		char c;
		int sum = 0;
		
		for(int i = 0; i < n.length(); i++) {
			c = n.charAt(i);
			if(c >= '0' && c <= '9') sum += (c -'0') * Math.pow(b, n.length() - i - 1);
			if(c >= 'A' && c <= 'Z') sum += (c - 55) * Math.pow(b, n.length() - i - 1);
		}
		
		System.out.println(sum);
	}

}
