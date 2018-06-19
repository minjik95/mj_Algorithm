package kr.ac.ds.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClimbingUpStairs {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[] a = new int[n + 1];
		int[] d = new int[n + 1];
		
		for(int i = 1; i <= n; i++) {
			a[i] = Integer.parseInt(bf.readLine());
		}
	
		d[1] = a[1];
		d[2] = d[1] + a[2];
		for(int i = 3; i <= n; i++) {
			d[i] = Math.max(d[i - 3] + a[i - 1] + a[i], d[i - 2] + a[i]);
		}
	
		System.out.println(d[n]);
	}

}
