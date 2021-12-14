package _07_ForLoop;

public class Q15 {
	
	public static void main(String[] args) {
    /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        seklini yazdýrýnýz.  65=A'nýn ascýý degeri
        */
		 int harf=65;
	      for (int baba = 0; baba < 6; baba++) {
	          for (int evlat = 0; evlat <=baba; evlat++) {
	              System.out.print((char)(harf+evlat)+" ");
	            
	        }
	        System.out.println();
	      } 
    }
}
