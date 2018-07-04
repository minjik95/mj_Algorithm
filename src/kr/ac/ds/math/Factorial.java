package kr.ac.ds.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int result = 1;
		
		if(n == 0) result = 1;
		for(int i = 1; i <= n; i++) {
			result = result * i;
		}
		
		System.out.println(result);
	}

}
