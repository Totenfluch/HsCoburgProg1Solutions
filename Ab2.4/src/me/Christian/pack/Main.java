package me.Christian.pack;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int d, m;
		int y;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Tag eingeben");
		d = sc.nextInt();
		if(!(d >= 1 && d <= 31)){
			System.out.println("The day has to be between 1 and 31; choosing 1");
			d = 1;
		}
		
		System.out.println("Monat eingeben");
		m = sc.nextInt();

		
		System.out.println("Jahr eingeben");
		y = sc.nextInt();
		
		
		if(m == 1){
			m = 13;
			y--;
		}else if(m == 2){
			m = 14;
			y--;
		}else if(m > 14){
			System.out.println("month has to be between 1 and 14; choosing 1");
			m = 13;
			y--;
		}else if(m == 13){
			y--;
		}else if(m == 14){
			y--;
		}
	
		int c = y/100;
		
		y = y%100;

		System.out.println("Jahuntert: " + c + "| Yahr im Jahrhunter " + y);

		
		int w = (d+(26*(m+1)/10) + ((5*y)/4) + (c/4) + (5*c) -1)%7;
		System.out.println(w);
		
		sc.close();
	}
}
