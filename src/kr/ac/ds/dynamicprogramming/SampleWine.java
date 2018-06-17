package kr.ac.ds.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SampleWine {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine()); 
		int[] a = new int[n + 1];
		int[][] d = new int[n + 1][3];
		int result = 0;

		for(int i = 1; i <= n; i++) {
			a[i] = Integer.parseInt(bf.readLine());
		}
		
		for(int i = 1; i <= n; i++) {
			d[i][0] = Math.max(d[i - 1][0], Math.max(d[i - 1][1], d[i - 1][2]));
			d[i][1] = d[i - 1][0] + a[i];
			d[i][2] = d[i - 1][1] + a[i];
		}
		
		result = Math.max(d[n][0], Math.max(d[n][1], d[n][2]));
		System.out.println(result);
	}

}
