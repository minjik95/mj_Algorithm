package kr.ac.ds.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoMultiplyNTiling2 {
	public static int[] d = new int[10001];
	
	public int TheNumberOfMethod(int n) {
		if(n == 0) return 1;
		if(n == 1) return 1;

		if(d[n] > 0) return d[n];

		d[n] = TheNumberOfMethod(n - 1) + TheNumberOfMethod(n - 2) * 2;
		d[n] %= 10007;

		return d[n];

	 }



	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		
		TwoMultiplyNTiling2 twoMultiplyNTiling2 = new TwoMultiplyNTiling2();
		System.out.println(twoMultiplyNTiling2.TheNumberOfMethod(n));
		
	}

}

