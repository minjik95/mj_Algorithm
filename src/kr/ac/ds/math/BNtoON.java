package kr.ac.ds.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BNtoON {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String n = bf.readLine();
		int length = n.length();
		int r = 0;
		int sum = 0;
		char c;
		ArrayList<Integer> result = new ArrayList<>();
		
		r = length % 3;
		if(r != 0) {
			for(int i = 0; i < r; i++) {
				c = n.charAt(i);
				sum += (c - '0') * Math.pow(2, r - i - 1);
			}
			result.add(sum);
			sum = 0;
		}
		
		for(int i = r; i < length; i += 3) {
			for(int j = 0; j < 3; j++) {
				c = n.charAt(i + j);
				sum += (c - '0') * Math.pow(2, 3 - j - 1);
			}
			
			result.add(sum);
			sum = 0;
		}
		
		for(int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i));
		}
	}
		
}
