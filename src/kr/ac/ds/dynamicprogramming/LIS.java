package kr.ac.ds.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LIS {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String[] line = null;
		int[] a = new int[n + 1];
		int[] d = new int[n + 1];
		int result = 0;
		
		line = bf.readLine().split(" ");
		for(int i = 1; i <= n; i++) {
			a[i] = Integer.parseInt(line[i - 1]);
		}
		
		for(int i = 1; i <= n; i++) {
			d[i] = 1;
			
			for(int j = 1; j < i; j++) {
				if(a[j] < a[i]) {
					d[i] = Math.max(d[j] + 1, d[i]);
				}
			}
		}
		
		result = d[1];
		for(int i = 1; i <= n ; i++) {
			if(result < d[i]) {
				result = d[i];
			}
		}
		
		System.out.println(result);
	}

}