package _07_ForLoop;

public class Q02 {
    public static void main(String[] args) {


// 0-255 e kadar olan harflerin , 
// sayý ve harf degerini konsola yazdýrýnýz.

      for (int i = 0; i <= 255; i++) {
		char harf=(char) i;// i variable char'dan buyuk oldugu icin data casting komutu ile char'a atandi 
		
		System.out.println(i +"-"+ harf);
      }		

    }
}


