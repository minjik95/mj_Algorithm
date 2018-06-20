package kr.ac.ds.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PadovanSequence {
	public static long[] d  = new long[101];
	
	public long LenOfEquilTriangle(int input) {
		d[1] = 1;
		d[2] = 1;
		d[3] = 1;
		d[4] = 2;
		
		for(int i = 5; i <= input; i++) {
			d[i] = d[i - 1] + d[i - 5];
		}
		
		return d[input];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int input = 0;
		
		PadovanSequence ps = new PadovanSequence();
		
		while(n-- > 0) {
			input = Integer.parseInt(bf.readLine());
			System.out.println(ps.LenOfEquilTriangle(input));
		}

	}

}
