package calismaAlani;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calisma06 {   //LISTEYE ARRAY ATADIM

	public static void main(String[] args) {
		
		// bir stringte tekrar eden karakterleri bulma
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir yazi yazin");
		String str=scan.nextLine();
		String arr[]=str.split("");  // stringi array e cevirdim
		List<String> arrList = Arrays.asList(arr); // liste yapip arrayin degerini ona atadim
		List<String> temp = new ArrayList<String>();      // gecici liste olusturdum  
		
		
		
		for (int i = 0; i < arr.length; i++) {
			 
			for (int j = i+1; j < arr.length; j++) {
				
				if (arrList.get(i).equals(arrList.get(j)))  {  
					
					if (!temp.contains(arr[i])) {
					     temp.add(arr[i]);  
					     } 
					
				} 
			}
		} 
		
		System.out.println(temp);
scan.close();		
	}

}
