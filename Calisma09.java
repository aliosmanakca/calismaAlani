package calismaAlani;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calisma09 {

	public static void main(String[] args) {
		
		String [][] isim = {{"ali","ayse","veli"},{"hasan","can"},{"suzan"}};
		List<String> liste = new ArrayList<>();
		
		for (int i = 0; i < isim.length; i++) {
			for (int j = 0; j < isim[i].length; j++) {  
				liste.add(isim[i][j]);
			}
		}
		
		Collections.sort(liste);
		System.out.println(liste);

	}

}
