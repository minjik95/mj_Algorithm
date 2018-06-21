package kr.ac.ds.math;

import java.util.Scanner;

public class GCDLCM {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		int realA = A;
		int realB = B;
		int temp = 0;
		
		int GCD = 0; //최대공약수
		int LCM = 0; //최소공배수
		
		
		
		while(A % B != 0) {
			temp = A;
			A = B;
			B = temp % B;
		}
		
		GCD = B;
		LCM = (realA * realB) / GCD;
		
		System.out.println(GCD);
		System.out.println(LCM);
	}
	
}
