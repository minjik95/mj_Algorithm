package kr.ac.ds.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ONtoBN {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String octalN = bf.readLine();
		char c;
		int n = 0;
		int r = 0;
		int count = 0;
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int i = octalN.length() - 1; i >= 0; i--) {
			c = octalN.charAt(i);
			n = c - '0';
			
			while(r >= 0) {
				r = n % 2;
				result.add(r);
				n = n / 2;
				count++;
				if(n == 0) break;
			}
			
			if(i != 0) {
				count = 3 - count;
				while(count-- > 0) {
					result.add(0);
				}
			}
			
			count = 0;
		}
		
		
		for(int i = result.size() - 1; i >= 0; i--) {
			System.out.print(result.get(i));
		}
	}

}
