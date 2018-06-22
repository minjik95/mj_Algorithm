package kr.ac.ds.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfGCDs {
	
	public int GCD(int i, int j) {
		if(j == 0) return i;
		else return GCD(j, i % j);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		String[] line = null;
		int[] input;
		long sum = 0;
		
		SumOfGCDs sumOfGCDs = new SumOfGCDs();
		
		while(t-- > 0) {
			line = bf.readLine().split(" ");
			input = new int[line.length];
			sum = 0;
			
			for(int i = 0; i < line.length; i++) {
				input[i] = Integer.parseInt(line[i]);
			}

			for(int i = 1; i <= input[0]; i++) {
				for(int j = i + 1; j <= input[0]; j++) {
					sum += sumOfGCDs.GCD(input[i], input[j]);
				}
			}
			
			System.out.println(sum);
		}

	}

}
