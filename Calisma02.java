package calismaAlani;



public class Calisma02 {

	public static void main(String[] args) {
		
		//kelimeleri birbirinden ayir
		
		String isim1= "ali osman akca elma"; 
		
		System.out.println(isim1);
		
		
		String isim2=isim1.substring(isim1.indexOf(" ")+1);
		
		System.out.println(isim2);
		
		String isim3=isim2.substring(isim2.indexOf(" ")+1);
		
		System.out.println(isim3);
		
		String isim4=isim3.substring(isim3.indexOf(" ")+1);
		
		System.out.println(isim4); 
		
		System.out.println("--------"); 
		
		System.out.println(isim1.substring(0,isim1.indexOf(" ")));
		
		isim2=isim2.substring(0,isim2.indexOf(" "));
		System.out.println(isim2);
		
		isim3=isim3.substring(0,isim3.indexOf(" "));
		System.out.println(isim3);
		
		System.out.println(isim4);
						 
		 
	}

}
