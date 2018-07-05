package kr.ac.ds.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class NumberSort {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int num = 0;
		
		int[] array = new int[n];
		
		for(int i = 0; i < n; i++) {
			num = Integer.parseInt(bf.readLine());
			array[i] = num;
		} 
		
		Arrays.sort(array);
		
		for(int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}
	}
}
