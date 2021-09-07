package calismaAlani;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calisma08 {

	public static void main(String[] args) {
		// icinde a harfi olanlari sil
		
		List<String> liste = new ArrayList<>(Arrays.asList("Ali","veli","ayse","ahmet","omer")); 
		//yeni bir liste olusturdum ve remove() kullanmadim cunku removu yaparsam dongu basa dondugunde elemanlarin indexi degisir. 
		List<String> yeniliste = new ArrayList<>();
		
		
		for (int i=0; i<liste.size(); i++) { 
			if (!liste.get(i).contains("a") && !liste.get(i).contains("A")) {
				yeniliste.add(liste.get(i));
			} 
		}
		/*
		  ikinci yontem
		  
		 for (String each : liste) {
			if (!each.contains("a")) {
				yeniliste.add(each);
			}
		}
		*/
		
		System.out.println(yeniliste);  

	}

}
