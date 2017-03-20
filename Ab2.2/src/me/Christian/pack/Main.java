package me.Christian.pack;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie eine Zahl dezimal ein:");
		int startval = sc.nextInt();
		System.out.println("Hex: " + Integer.toHexString(startval));
		System.out.println("Binär: " + Integer.toBinaryString(startval));
		System.out.println("Bitte geben Sie eine Zahl hexadezimal ein:");
		String hexstart = sc.next();
		int inthexstart = Integer.parseInt(hexstart, 16);
		System.out.println("Dezimal: " + inthexstart);
		System.out.println("Binär: " + Integer.toBinaryString(inthexstart));
		System.out.print("Bitte geben Sie eine Zahl binär ein:");
		String binstart = sc.next();
		int intbinstart = Integer.valueOf(binstart, 2);
		System.out.println("Dezimal: " + intbinstart);
		System.out.println("Hex: "+ Integer.toHexString(intbinstart));
		System.out.println("Bitte geben sie eine Zahl octal ein:");
		String octalstart = sc.next();
		int intoctalstart = Integer.valueOf(octalstart, 8);
		System.out.println("Dezimal: " + intoctalstart);
		System.out.println("Hex:" + Integer.toHexString(intoctalstart));
		sc.close();
	}
}
