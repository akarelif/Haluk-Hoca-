package _07_ForLoop;

import java.util.Scanner;

public class Q10 {
	
	public static void main(String[] args) {
    /*Kullanýcýdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf oldugunu,
    degilse sessiz harf oldugunu ekrana yazdýrsýn. Girdigi deger harf degilse yada
            1 karakterden fazla ise hata mesajý gostersin. (Test girilen harfi buyuk yada kucuklugune duyarlýdýr.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Cýktý:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Cýktý:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Cýktý:
    Yanlis karakter girdiniz!

     */
    
		Scanner scan=new Scanner(System.in);
    	
    	System.out.print("Luften bir harf giriniz : ");
    	String girilenHarf=scan.nextLine();
    	
    	String sesliHarfler="aeýuo";
    	String sessizHarfler="bcdfghjklmnprstvyxzwq";
    			
    	if (girilenHarf.length()==1) { // tek harf kontrolu yapildi	
				}
    		for (int i = 0; i < sessizHarfler.length(); i++) {
    			
				if (girilenHarf.charAt(0)==sesliHarfler.charAt(i)) {
					System.out.println("Girilen harf seslidir");
					break;
					
				} else if(girilenHarf.charAt(0)==sessizHarfler.charAt(i)) {
					System.out.println("Girilen harf sessizdir");
					break;
				}else{
                   //System.out.println("AGAM nedding yanlis karakter girdin :)");
                   //break;
                   
				}
    		
			}
	
		
		
scan.close();
       
    }
}

