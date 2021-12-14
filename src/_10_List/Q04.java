package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {
 
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args, String dewamkee, List<Integer> listNotlar, String devamkee) {
        // Bir Ogretmenden girmek istedigi kadar notu alýnýz, ve
        // ortalamayý gecen ogrenci sayýsýný bulunuz.

       
	List<Integer> list =new ArrayList<>();
       
       Scanner scan = new Scanner(System.in);
       scan.close();
		do {
        	System.out.println("Not Giriniz :");
        	int ogrNot=scan.nextInt();
	     	System.out.println("dewamkee : E/H ");
        	dewamkee= scan.nextLine();
        	listNotlar.add(ogrNot);
        	
        }while (devamkee.equalsIgnoreCase("E"));
    	
    	// Ortalam Hesaplamasi
        
        int toplam=0;
    	
    	
		for (int i = 0; i < listNotlar.size(); i++) {
			
    		toplam+=listNotlar.get(i);
		}
    	
    	double ortalama=toplam/listNotlar.size();
    	
    	// ortalamayi Gecen Org Sayisi
    	
    	int ortlamaGecenSayisi=0;
    	
     {
    	 int ortalamaGecenSayisi=0;
			for (int i = 0; i < listNotlar.size(); i++) {
				if(listNotlar.get(i)>ortalama) {;
				ortalamaGecenSayisi++;
				
			}
		
		}
    	
    	System.out.println(ortalamaGecenSayisi);
    	
     }  	

    }
}
