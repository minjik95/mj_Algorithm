package kr.ac.ds.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneTwoThree {
	public static int[] d = new int[11];
	
	public int TheNumberOfMethod(int num) {
		if(num == 0) return 1;
		if(num == 1) return 1;
		if(num == 2) return 2;
		
		d[num] = TheNumberOfMethod(num - 1) + TheNumberOfMethod(num - 2) + TheNumberOfMethod(num - 3);  
		
		return d[num];

	 }
	
	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bufferedReader.readLine());
		int input = 0;

		OneTwoThree oneTwoThree = new OneTwoThree();
		
		while(num-- > 0) {
			input = Integer.parseInt(bufferedReader.readLine());
			System.out.println(oneTwoThree.TheNumberOfMethod(input));

	  }
		
	}

}
