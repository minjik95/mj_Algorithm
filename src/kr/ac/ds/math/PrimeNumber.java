package kr.ac.ds.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String line = bf.readLine();
		String[] nums = line.split(" ");
		int[] numbers = new int[n];
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			numbers[i] = Integer.parseInt(nums[i]);
		}
		
		for(int i = 0; i < n; i++) {
			if(numbers[i] == 2) count++;
			for(int j = 2; j < numbers[i]; j++) {
				if(numbers[i] % j == 0) break;
				if(numbers[i] % j != 0 && j == numbers[i] - 1) count++;
			}
		}
		
		System.out.println(count);
	}
}
