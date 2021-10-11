package calismaAlani;

import java.util.Scanner;

public class Calisma15 {
  
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir yazi yazin");
		StringBuilder sb = new StringBuilder(scan.nextLine());
		
		String duz = sb.toString();
		String ters =sb.reverse().toString();
		
		if (duz.equalsIgnoreCase(ters)) {
			System.out.println("bu bir polindrome");
		}else System.out.println("polindrome degil");
		
scan.close();	
	}

}
