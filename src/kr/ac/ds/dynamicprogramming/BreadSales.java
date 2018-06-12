package kr.ac.ds.dynamicprogramming;

import java.util.Scanner;

public class BreadSales {
	public static int[] d = new int[1001];
	public static int[] p = new int[1001];
	
	public int MaxOfPrice(int num) {
		int temp = 0;
		
		if(d[num] > 0) return d[num];
		
		for(int i = 1; i <= num; i++) {
			temp = MaxOfPrice(num - i) + p[i];
			if(temp > d[num]) d[num] = temp;
		}
		
		return d[num];
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		BreadSales breadSales = new BreadSales();
		
		for(int i = 1; i <= num; i++) {
			p[i] = Integer.parseInt(sc.next());
		}
		
		System.out.println(breadSales.MaxOfPrice(num));
		
	}
}
