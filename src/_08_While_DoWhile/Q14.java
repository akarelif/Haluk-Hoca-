package _08_While_DoWhile;

import java.util.Scanner;

public class Q14 {
  
	public static void main(String[] args) {
        /*  Problem Tanýmý
        Verilen bir sayýnýn faktoriyelini Ozyineli (recursive) olarak
        hespalayan fonksiyonu yazýnýz.

        Ornek Ekran Cýktýlarý
        Bir sayi giriniz: 6 *5*4*3*2*1=720
        Faktoriyeli: 720

        Bir sayý giriniz: 3 *2*1
        Faktoriyeli 6
     */

    	Scanner scan=new Scanner(System.in);
		System.out.print("Bir Sayi Giriniz : ");
		int sayi=scan.nextInt();
		
        int faktoriyel=1;
        
		while(sayi>0);{
		faktoriyel*=sayi;
		sayi--;
		
		}
		
		System.out.println("Faktoriyeli : " +faktoriyel);
		scan.close();
    }
}


