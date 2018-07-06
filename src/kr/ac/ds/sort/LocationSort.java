package kr.ac.ds.sort;

import java.util.Arrays;
import java.util.Scanner;

public class LocationSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int x = 0;
		int y = 0;
		Location[] location = new Location[t];
		
		for(int i = 0; i < t; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			
			location[i] = new Location(x, y);
		}
		
		Arrays.sort(location);
		
		for(int i = 0; i < t; i++) {
			System.out.println(location[i].x + " " + location[i].y);
		}
	}

}

class Location implements Comparable<Location>{
	int x = 0;
	int y = 0;
	
	Location(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Location l) {
		// TODO Auto-generated method stub
		if(this.x > l.x)
			return 1;
		else if(this.x < l.x)
			return -1;
		else {
			if(this.y > l.y) return 1;
			else return -1;
		}
	}
}
