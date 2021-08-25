package calismaAlani;

import java.util.Scanner;

public class Calisma01 {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("evet yada hayir yazin");
		String str=scan.next().toLowerCase();  // kucuk harfe esitledim
		
		
		if (str.equals("evet")) {  // equals methodu
			System.out.println("yes");
		}else if (str.contains("hayir")) {  // contains methodu
			System.out.println("no");
		} else {
			System.out.println("yanlis cevap");
		}
		
		
		System.out.println("bir karakter girin");
		char karakter=scan.next().charAt(0);
		
		if (karakter=='a') {      // char da == kullanabiliriz ama String de kullaninca sikinti olur.
                                  // Strin de bunun icin contains methodu kullanmaliyiz			
			System.out.println("cevap a");
		} else {
			System.out.println("baska bisey");
		}
		
		
		
scan.close();		
		
	    }

	}
