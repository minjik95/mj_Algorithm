package kr.ac.ds.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ANumberOfZero {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int count2 = 0;
		int count5 = 0;
		int num = 0;
		
		// 결국 10의 개수가 몇 개인가를 구하는 문제
		for(int i = 1; i <= n; i++) {
			num = i;
			
			while(num % 2 == 0) {
				num /= 2;
				count2++;
			}
			
			while(num % 5 == 0) {
				num /= 5;
				count5++;
			}
		}
		
		if(count2 >= count5) System.out.println(count5);
		else System.out.println(count2);
		
	}

}
