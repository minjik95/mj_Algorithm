package kr.ac.ds.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareNumber {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		int[] d = new int[num + 1];
		
		for(int i = 1; i <= num; i++) {
			d[i] = i;
			for(int j = 1; j * j <= i; j++) {
				if(d[i] > d[i - j * j] + 1) 
					d[i] = d[i - j * j] + 1;
			}
			
		}
		
		System.out.println(d[num]);
	}

}
