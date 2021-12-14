package javaProjects.okulYonetimi;

/*
	BİR OKUL YONETİM PLATFORMU KODALYINIZ.

	1.	Bu programda, ogrenci ve ogretmen Kayıtları ile ilgili islemler yapılabilmelidir.
		Kayıtlarda su bilgiler olabilmelidir.

		Ogretmen: Ad-Soyad,  kimlik No, yas, bolum, ve sicil No bilgileri icermelidir.
		Ogrenci: Ad-Soyad,  kimlik No, yas, numara, sınıf bilgileri icermelidir.

	2.	Program basladıgında Kullanıcıya, ogretmen ve ogrenci islemlerini secebilmesi icin
		Asagıdaki gibi bir menu gosterilsin.

	====================================
	OGRENCI VE OGRETMEN YONETIM PANELI
	====================================
	 1-OGRENCI ISLEMLERI
	 2-OGRETMEN ISLEMLERI
	 Q- CIKIS

	3.	Secilen Kisi turune gore aasagıdaki islemleri gosteren bir alt menu daha gosterilsin.

	============= ISLEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-LISTELEME
		 4-SILME
		 5-ANA MENU
		 Q-CIKIS

	SECIMINIZ:

	4.	Islemler menusunde secilen isleme gore bir onceki menude secilen Kisi turu ile ilgili
	    ekleme, kimlik no ile silme ve arama, var olan tum kisileri listeleme gibi islemler yapılabilmelidir.
		Bunun yanında bir ust menuye donme veya cıkıs islemleri de yapılabilmelidir.

 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogrenciList = new ArrayList<Kisi>();
    static List<Kisi> ogretmenList = new ArrayList<Kisi>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;

    public static void anaMenu() {
        System.out.println("====================================\nOGRENCI VE OGRETMEN YONETIM PANELI\n" +
                "====================================\n"
                + "1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS");
        System.out.print("isleminiz seciniz : ");

        String secim = scan.next().toUpperCase();


        switch (secim) {

            case "1":
                kisiTuru = "OGRENCI";
                islemMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;
            case "Q":
                cıkıs();
                break;
            default:
                System.out.println("hatali giris yaptiniz !!!");
                anaMenu();
                break;

        }

    }

    private static void cıkıs() {
        System.out.println("uygulamayi kullandiginiz icin thanks bro  :)");
    }

    private static void islemMenusu() {
        System.out.println("3. Secilen Kisi turune gore asagıdaki islemleri gosteren bir alt menu daha gosterilsin.\r\n"
                + "============= ISLEMLER =============\r\n"
                + "     1-EKLEME\r\n"
                + "     2-ARAMA\r\n"
                + "     3-LISTELEME\r\n"
                + "     4-SILME\r\n"
                + "     0-CIKIS");

        System.out.println("İslem Tercihinizi Giriniz : ");
        int islemTercihi = scan.nextInt();
        switch (islemTercihi) {
            case 0:
                anaMenu();
                break;
            case 1:
                ekleme();
                islemMenusu();
                break;
            case 2:
                arama();
                islemMenusu();
                break;
            case 3:
               listeleme();
                islemMenusu();
                break;
            case 4:
               silme();
                islemMenusu();
                break;
            default:
                System.out.println("Hatali Giris Yaptiniz :( ");
                islemMenusu();
                break;


        }
    }

    private static void silme() {
		
	}

	private static void listeleme() {
		
		
	}

	private static void arama() {
    	System.out.println("**** "+kisiTuru+" Arama Sayfasi *****");
    	boolean kontrol=true;
    	
    	if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
			System.out.println("Aradıgınız Ogrenci Kimlik No Giriniz : ");
			
			String araOgrcKimlik =scan.nextLine();
			scan.next();
			for (Kisi k : ogrenciList) {
				if (k.getKimlikNo().contains(araOgrcKimlik)) {
					
					System.out.println("Aradiginiz Ogrenci : " + k.getAdSoyad());
					kontrol=false;
					
				}if (kontrol==true) {
					System.out.println("Aradiginiz Ogrenci Mevcut Degil");
				} else {
					
						System.out.println("Aradıgınız Ogretmen Kimlik No Giriniz : ");
						
						String araOgrtKimlik =scan.nextLine();
						scan.next();
						for (Kisi k1 : ogretmenList) {
							if (k1.getKimlikNo().contains(araOgrtKimlik)) {
								
								System.out.println("Aradiginiz Ogretmen : " + k1.getAdSoyad());
								kontrol=false;
								
							}if (kontrol==true) {
								System.out.println("Aradiginiz Ogtermen Mevcut Degil");
		    	
							}
						}
					}
				}
			}
    	}
						
    	
	

	private static void ekleme() {

    	System.out.println("***** "+kisiTuru+" Ekleme Sayfasi *****");
    	System.out.println("Ad Soyad Giriniz : ");
    	scan.nextLine();
    	
    	String adSoyad =scan.nextLine();
    	System.out.println("Kimlik No Giriniz : ");
    	String kimlikNo =scan.next();
    	System.out.println("Yas Giriniz : ");
    	
    	int yas =scan.nextInt();
    	
    	if (kisiTuru.equals("OGRENCİ")) {
    		System.out.println("Ogrenci No Giriniz : ");
    		String numara =scan.next();
    		System.out.println("Sınıfı  Giriniz : ");
    		String sinif =scan.next();
    		
    		Ogrenci ogrenci =new Ogrenci(adSoyad,kimlikNo,yas,numara,sinif);
    		
    		ogrenciList.add(ogrenci);
    		System.out.println(ogrenci.toString()+ "eklendi");
    		
		} else {
			System.out.println("Sicil No Giriniz : ");
			String sicilNo =scan.next();
			System.out.println("Bolum Giriniz : ");
			String bolum =scan.next();
			
			Ogretmen ogrt =new Ogretmen(adSoyad,kimlikNo,yas,sicilNo,bolum);
			ogretmenList.add(ogrt);	
			System.out.println(ogrt.toString()+ "eklendi");
		}
    	
    
    }


}
