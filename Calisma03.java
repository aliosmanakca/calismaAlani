package calismaAlani;

import java.util.Scanner;

public class Calisma03 {

	public static void main(String[] args) {
   
		Scanner scan=new Scanner(System.in);
		System.out.println("dakika sayisini girin");
		int sayi=scan.nextInt();
		
		int yil=sayi/525600;
		int gun=(sayi%525600)/1440;
		
		System.out.println(sayi + " dakika yaklasik "+yil+" yil "+gun+" gundur");

scan.close();	  	 
   }
			
}
