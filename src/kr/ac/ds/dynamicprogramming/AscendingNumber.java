package kr.ac.ds.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AscendingNumber {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bufferedReader.readLine());
		
		long[][] d = new long[num + 1][10];
		long result = 0;
		
		
		for(int i = 0; i < 10; i++) d[1][i] = 1;
		
		for(int i = 2; i <= num; i++) {
			for(int j = 0; j <= 9; j++) {
				for(int k = 0; k <= j; k++) {
					if(k > 9) break;
					
					d[i][j] += d[i - 1][k];
					d[i][j] %= 10007;
				}
			}
		}
		
		for(int i = 0; i < 10; i++) {
			result += d[num][i];
		}
		
		System.out.println(result % 10007);
	}

}
