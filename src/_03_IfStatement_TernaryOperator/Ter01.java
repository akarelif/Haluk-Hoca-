package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter01 {

    public static void main(String[] args) {

        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

    	
    	Scanner scan=new Scanner(System.in);
		
    	System.out.print("Lutfen bir sayi giriniz: ");	
		int sayi=scan.nextInt();
	     
		System.out.println("**** ternary cözüm*****");  
		
		String result=(sayi>=0)?((sayi<10)?("rakam"):("Pozitif Sayi")):("Negatif Sayi");
	        
		System.out.println(result);
    	
		System.out.println("***** if cozumu *****");
		if (sayi>=0) {
		if (sayi<10) {
			System.out.println("rakam");
			
		}else {
			System.out.println("Pozitif Sayi");	
		}
		}else {
			System.out.println("Negatif sayi");
		}
    	
    	
    	scan.close();
       
    }
}
