package kr.ac.ds.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoldenBachConjecture {
	private static final int MAX = 1000000;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int evenNum = 0;
		int num = 0;
		int a = 0;
		int[] prime = new int[MAX];
		boolean[] c = new boolean[MAX + 1]; // if a number is a prime, c is false 
		boolean wrong = false;
		
		c[0] = c[1] = true;
		for(int i = 2; i * i <= MAX; i++) {
			if(c[i] == false) {
				prime[num++] = i;
			}
			
			for(int j = i + i; j <= MAX; j += i) c[j] = true;
		}
				
		while(true) {
			evenNum = Integer.parseInt(bf.readLine());
			if(evenNum == 0) break;
			
			for(int i = 1; i < num; i++) { //prime[0] => 2, We need to the numbers which are odd and prime 
				a = prime[i];
				if(c[evenNum - a] == false) {
					wrong = true;
					break;
				}	
			}
			
			if(wrong) System.out.println(evenNum + " = " + a + " + " + (evenNum - a));
			else System.out.println("Goldbach's conjecture is wrong.");
		}
	}

}
