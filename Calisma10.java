package calismaAlani;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calisma10 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		// bir stringin icindeki sayilari toplama
		
		Scanner scan = new Scanner(System.in);
		System.out.println("icinde sayilar da olan bir yazi yazin");
		String str = scan.nextLine();
		List<String> liste = new ArrayList();
		
		for (int i = 0; i < str.length(); i++) {
			if ( Character.isDigit(str.charAt(i)) ) {
				liste.add(Character.toString(str.charAt(i))); // characteri stringe cevirdim
			}
		}
		
		System.out.println(liste);
		
		int toplam=0;
		for (int i = 0; i < liste.size(); i++) {
			toplam+=Integer.parseInt(liste.get(i)); // stringi integera cevirdim
		}
		 
		System.out.println(toplam);
		
		scan.close();
	}

}
