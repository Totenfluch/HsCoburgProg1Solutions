package me.Christian.pack;

public class Main {

	public static void main(String[] args) {
		String erster = "hallo du kleiner mensch";
		String zweiter = "HallO DU GRO�er MENSCH!!!";
		
		System.out.println(zweiter.compareTo(erster));
		if(zweiter.compareTo(erster) < 0){
			System.out.println("zweiter ist gr��ter als erster");
		}else if(zweiter.compareTo(erster) == 0){
			System.out.println("Die sind gleich gro� :o");
		}else{
			System.out.println("Erster ist gr��er als zweiter");
		}
	}
	
	

}
