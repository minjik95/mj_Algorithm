package kr.ac.ds.math;

import java.util.Scanner;

public class RadixTransformation2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		int r = 0;
		StringBuilder result = new StringBuilder();
		
		while(r >= 0) {
			r = n % b;
			if(r > 9) result.append((char)(r + 55));
			else result.append((char)(r + '0'));
			
			n = n / b;
			if(n == 0) break;
		}
		
	
		System.out.println(result.reverse());
	}

}
