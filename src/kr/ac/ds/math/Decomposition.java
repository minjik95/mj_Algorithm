package kr.ac.ds.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decomposition {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int i = 2;
		
		while(n > 1) {
			if(n % i == 0) {
				n = n / i;
				System.out.println(i);
			}
			else i++;
		}
	}

}
