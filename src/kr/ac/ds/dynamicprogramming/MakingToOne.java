package kr.ac.ds.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakingToOne {
	public static int[] d = new int[1000001];

	public int MinimumCal(int num) {
		int temp = 0;
		
		if(num == 1) return 0;
		
		if(d[num] > 0) return d[num];
		
		d[num] = MinimumCal(num - 1) + 1;
		if(num % 3 == 0) {
			temp = MinimumCal(num / 3) + 1;
			if(d[num] > temp) d[num] = temp;
		}
		
		if(num % 2 == 0) {
			temp = MinimumCal(num / 2) + 1;
			if(d[num] > temp) d[num] = temp;
		}
		
		return d[num];
	}
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bufferedReader.readLine());
		
		MakingToOne makingToOne = new MakingToOne();
		System.out.println(makingToOne.MinimumCal(num));
	}

}
