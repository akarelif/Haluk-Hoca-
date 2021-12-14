package _08_While_DoWhile;

import java.util.Scanner;

public class Q12 {

		public static void main(String[] args) {
			
    // Bir top 220 m  yukseklikten atýlmaktadýr.
    // Atýldýktan sonra, atýldýgý yuksekligin 3/4 u kadar yerden yukarý dogru zýplamaktadýr
    // Top zýplama  yuksekligi 1 metrenin altýna indiginde durmaktadýr.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayýsýný bulunuz.

			Scanner scan=new Scanner(System.in);
			
			System.out.print("Topun Birakildigi Ýlk Yükseklikgi Giriniz : ");
			double yukseklik=scan.nextDouble();
			double topunToplamYolu=0;
			int yerevurmaSayisi=0;
			
			do {
				yerevurmaSayisi++;
				topunToplamYolu+=yukseklik;
				yukseklik*=(0.75);
				topunToplamYolu+=yukseklik;
			
			}
			
			while (yukseklik>=1); 
				
				System.out.println("Topun Yere Vurma Sayisi : " +yerevurmaSayisi);
				System.out.println("Topun Aldigi Toplam Yol : " +topunToplamYolu);
			
			scan.close();
			
			
			
			
			
			
		

    }
}
