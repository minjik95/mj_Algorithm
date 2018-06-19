package kr.ac.ds.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContinuousSum {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String[] line = null;
		int[] a = new int[n + 1];
		int[] d = new int[n + 1];
		int max = 0;
		int result = 0;
		
		line = bf.readLine().split(" ");
		for(int i = 1; i <= n; i++) {
			a[i] = Integer.parseInt(line[i - 1]);
		}
		
		for(int i = 1; i <= n; i++) {
			d[i] = a[i];
			max = d[i];
			for(int j = i - 1; j >= 0; j--) {
				d[i] += a[j];
				if(d[i] > max) max = d[i];
			}
			
			d[i] = max;
		}
		
		result = d[1];
		for(int i = 1; i <= n; i++) {
			if(d[i] > result) result = d[i];
		}
		
		System.out.println(result);
	}

}
