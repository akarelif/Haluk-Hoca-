package _08_While_DoWhile;

import java.util.Scanner;

public class Q09 {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
//  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazýnýz.

    	
    	Scanner scan=new Scanner(System.in);
		System.out.println("Pin code giriniz :");
		int userPin=scan.nextInt();
		int systemPin=1453;
		
		while(userPin!=systemPin) {
			System.out.println("***** hatali giris yapildi *****");
			System.out.println("***** bidaha dene *****");
			userPin= scan.nextInt();
		}
    	System.err.println("gayet basarili.......");
    	
    }
}

