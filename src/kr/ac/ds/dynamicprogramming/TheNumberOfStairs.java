package kr.ac.ds.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheNumberOfStairs {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bufferedReader.readLine());
		
		long[][] d = new long[num + 1][10];
		long result = 0;
		
		
		for(int i = 1; i <= 9; i++) d[1][i] = 1;
		for(int i = 2; i <= num; i++) {
			for(int j = 0; j <= 9; j++) {
				if(j - 1 >= 0) d[i][j] += d[i - 1][j - 1];
				if(j + 1 <= 9) d[i][j] += d[i - 1][j + 1];
				
				d[i][j] %= 1000000000;
			}
		}
		
		for(int k = 0; k < 10; k++) {
			result += d[num][k];
		}
		
		System.out.println(result % 1000000000);
	}

}