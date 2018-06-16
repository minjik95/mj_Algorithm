package kr.ac.ds.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sticker {
	public static int[][] a = new int[100001][3];
	public static int[][] d = new int[100001][3];
	
	public void MaxOfScore(int n) {
		int result = 0;
		
		for(int i = 1; i <= n; i++) {
			d[i][0] = Math.max(Math.max(d[i - 1][0], d[i - 1][1]), d[i - 1][2]);
			d[i][1] = Math.max(d[i - 1][0], d[i - 1][2]) + a[i][1];
			d[i][2] = Math.max(d[i - 1][0], d[i - 1][1]) + a[i][2];
			
		}
		
		result = Math.max(Math.max(d[n][0], d[n][1]), d[n][2]);
		System.out.println(result);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine()); // test case 개수
		int n = 0; // 스티커 열의 개수
		String[] line = null;
		
		Sticker sticker = new Sticker();
		
		while(t-- > 0) {
			n = Integer.parseInt(bf.readLine());
			
			line = bf.readLine().split(" ");
			for(int i = 1; i <= n; i++) {
				a[i][1] = Integer.parseInt(line[i - 1]);
			}
			
			line = bf.readLine().split(" ");
			for(int i = 1; i <= n; i++) {
				a[i][2] = Integer.parseInt(line[i - 1]);
			}
			
			sticker.MaxOfScore(n);
		}
		
	}

}
