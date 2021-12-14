package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QManav {
	static List<String> urunListesi =new ArrayList<>(); // Urunlerin atanacagý bos list olusturuldu
	static List<Double> urunFiyatlari =new ArrayList<>(); // Urun fiyatlarinin atanacagi bos lis olusturuldu
	static double toplanOdenecekTutar;

	public static void main(String[] args) {
		/*
		 * Basit bir 5 ornekle manav alisveris programi yaziniz.
		 *
		 * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
		 * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
		 * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
		 * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
		 * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
		 * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
		 *
		 * */

     		
		
	urunListesi.add("domates - urun kodu : 1");
		
	urunListesi.add("elma - urun kodu : 2");	
	
	urunListesi.add("muz - urun kodu : 3");
	
	urunListesi.add("biber - urun kodu : 4");
	
	urunListesi.add("patlican - urun kodu : 5");
	
	urunFiyatlari.add(5.8);
	
	urunFiyatlari.add(7.5);
	
	urunFiyatlari.add(11.3);
	
	urunFiyatlari.add(8.7);
	
	urunFiyatlari.add(9.2);
	
	System.out.println(urunListesi);
	
	musteriSecim();
	
	}

	private static void musteriSecim() {
		
		
		Scanner scan = new Scanner(System.in);
		scan.close();
		
		System.out.println("Hangi Urunu Secmek Ýstersiniz : ");
		
		int secim =scan.nextInt();
		
		System.out.println("Sectiginiz Urunden Kac Kilo Alacaksiniz : ");
		
		double kilo =scan.nextDouble();
		
		double urunTutari =urunFiyatlari.get(secim-1);
		
		double urunTolamTutar =kilo*urunTutari;
		
		toplanOdenecekTutar+= urunTolamTutar; // Alinan Her Urun Odemesi Ana Odemeye Eklendi
		
		System.out.println("Devam Edecekseniz 1, Kasa Ýcin 2 Seciniz.....");
		
		int karar=scan.nextInt();
		
		if (karar ==1) {
			
			musteriSecim();
			
		}else kasa();
	}

	private static void kasa() {
		
		System.out.println("Alisverinizin Toplam Tutari : " +toplanOdenecekTutar);
		
	}
}
