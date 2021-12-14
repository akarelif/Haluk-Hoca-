package _08_While_DoWhile;

import java.util.Scanner;

public class Q18 {
    @SuppressWarnings("resource")
	public static void main(String[] args) {

        //TODO STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yazýnýz.

    	Scanner scan=new Scanner(System.in);
		
		String systemPin="Javacanlara selam olsun";
		
		int girisHakki=3;
		while(true) {
			System.out.println("Pin code giriniz :");
			String userPin=scan.nextLine();
			if (userPin.equals(systemPin)) {
				System.out.println("Gayet Basarili");
				break;
			}else {
				System.out.println("Hatali Giriþ Yapildi");
				girisHakki--;
				System.out.println("Kalan Deneme Hakkiniz : "+girisHakki);
				if (girisHakki== 0) {
					System.out.println("Hakkiniz Kalmadi");
					break;
				}
			}
		}

		
		
		
		
		
		
    }


}
