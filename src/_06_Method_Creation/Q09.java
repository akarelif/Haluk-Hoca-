package _06_Method_Creation;

import java.util.Scanner;

public class Q09 {
	/*
    Problem Tanýmý:
    addDigits isminde bir method olusturun.
    Parametresi int
    Return tipi de int
    Pozitif int degerler ver ve en son sonuc tek basamaklý cýkana kadar basamaklarý birbiriyle topla.
    Tek basamaklýcýktýgýnda, döndurun

    örnek1:
    Girdi 38
    Cýktý: 2
    Acýklama: islemler söyle olacak: 3 + 8 = 11, 1 + 1 = 2.
                 2 , tek basamaklý oldugundan, bunu döndurun.
    */


    public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.print("Sayý Giriniz: ");
        int num = scanner.nextInt();

        System.out.println(addDigits(num));


    }

    public static int rakamTopla(int sayi) {
/*
        String str = String.valueOf(num);//num a girilen int deÄŸerlerini str ye ata
        String[] arr = str.split("");//str deki arr  arraysa ata

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        return sum;

 */

        int toplam =0;
        int rakam =0;


        while (sayi>0) {

            rakam = sayi%10;
            toplam+=rakam;
            sayi/=10;
        }
        System.out.println("Girdiginiz sayinin rakamlar toplami: "+toplam);



        return toplam;
    }

    public static int addDigits(int num) {
        nasil("kolay gelsin method run oluyor");
        for (int i = 0; i < 2; i++) {
            num = rakamTopla(num);//girilen int num sayÄ±sÄ±nÄ± sum metoduna gÃ¶nder gelen deÄŸeri tekrar num a ata tekrar sum a gÃ¶nder

            if (num < 10)//tek basamaklÄ± yani rakamsa kodu kÄ±r.
                break;
        }
       // gozunAydin("helal olsun bu method calistiysa dewamkeee");
        return num;
    }

    private static void gozunAydin(String naber) {
        System.out.println("gozunAydin method calisti"+naber);
    }

    private static void nasil(String mesaj) {
        System.out.println("nasÄ±l methodu calisti :"+mesaj);
        gozunAydin("helal olsun bu method calistiysa dewamkeee");
    }

}
