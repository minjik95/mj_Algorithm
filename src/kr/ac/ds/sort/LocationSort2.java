package kr.ac.ds.sort;

import java.util.Arrays;
import java.util.Scanner;

public class LocationSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int x = 0;
		int y = 0;
		
		Location2[] locations = new Location2[t];
		for(int i = 0; i < t; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			
			locations[i] = new Location2(x, y);
		}
		
		Arrays.sort(locations);
		
		for(int i = 0; i < t; i++) {
			System.out.println(locations[i].x + " " + locations[i].y);
		}
	}

}

class Location2 implements Comparable<Location2>{
	int x = 0;
	int y = 0;
	
	public Location2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Location2 l) {
		// TODO Auto-generated method stub
		if(this.y > l.y) return 1;
		else if(this.y < l.y) return -1;
		else {
			if(this.x > l.x) return 1;
			else return -1;
		}
		
	}
	
}
