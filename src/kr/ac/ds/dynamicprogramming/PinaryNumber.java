package kr.ac.ds.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PinaryNumber {
	public static long[] d = new long[91];
	
	public long TheNumberOfPN(int num) {
		d[1] = 1;
		
		if(d[num] > 0) return d[num];

		if(num > 1) d[num] = TheNumberOfPN(num - 1) + TheNumberOfPN(num - 2);
				
		return d[num];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bufferedReader.readLine());
		
		PinaryNumber pinaryNumber = new PinaryNumber();
		System.out.println(pinaryNumber.TheNumberOfPN(num));
	}

}
