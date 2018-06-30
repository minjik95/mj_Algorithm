package kr.ac.ds.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber2 {
	
	public static boolean IsPrime(int num) {
		if(num == 1) return false;
		else if(num == 2) return true;
		else {
			for(int i = 2; i * i <= num; i++) {
				if(num % i == 0) return false;
			}
			return true;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line = bf.readLine();
		String[] nums = line.split(" ");
		
		int m = Integer.parseInt(nums[0]);
		int n = Integer.parseInt(nums[1]);
		
		int[] numbers = new int[n + 1];
		boolean[] isPrime = new boolean[n + 1];
		
		for(int i = m; i <= n; i++) {
			numbers[i] = i;
		}
		
		for(int i = m; i <= n; i++) {
			isPrime[i] = IsPrime(i);
			if(isPrime[i]) {
				for(int j = i + i; j <= n; j += i ) {
					isPrime[j] = false;
				}
			}
		}
		
		for(int i = m; i <= n; i++) {
			if(isPrime[i]) System.out.println(numbers[i]);
		}
	}

}
