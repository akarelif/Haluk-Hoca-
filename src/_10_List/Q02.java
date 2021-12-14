package _10_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q02 {

    public static void main(String[] args) {
    	
     // 2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tum elemanlarý bir
     // listeye kopyalayan ve harf sýrasýna gore yazdýran bir METHOD yazýnýz.
     // Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
     //   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]


    	String isim[][]={{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};
    	
    	List<String> list1=new ArrayList<>();
    	
    	for (int kat = 0; kat < isim.length; kat++) {
			for (int daire = 0; daire < isim[kat].length; daire++) {
				list1.add(isim[kat][daire]);// Girilen katin dairesi list eklendi
			}
		}
    	
    	
    	System.out.println("Ýlk Liste :" + list1); // [Ali, Veli, Ayse, Hasan, Can, Suzan]
    	Collections.sort(list1);
    	System.out.println("Siralamadan Sonraki Liste : " + list1); // [Ali, Ayse, Can, Hasan, Suzan, Veli]
    	
    	
    }
public static void yeniList(String[][]isim) {
	
	List<String> list1=new ArrayList<>();
	
	for (int kat = 0; kat < isim.length; kat++) {
		for (int daire = 0; daire < isim[kat].length; daire++) {
		list1.add(isim[kat][daire]);// Girilen katin dairesi list eklendi
		}
	}
	
	
	System.out.println("Ýlk Liste :" + list1); // [Ali, Veli, Ayse, Hasan, Can, Suzan]
	Collections.sort(list1);
	System.out.println("Siralamadan Sonraki Liste : " + list1); // [Ali, Ayse, Can, Hasan, Suzan, Veli]
	
}
}
