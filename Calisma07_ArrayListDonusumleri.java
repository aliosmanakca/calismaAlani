package calismaAlani;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Calisma07_ArrayListDonusumleri {

	public static void main(String[] args) {
		
        List <String> itemList = new ArrayList<>();
		 
		itemList.add("item1");
		itemList.add("item2");
		itemList.add("item3");
 
		String[] arr = itemList.toArray(new String[0]); // array e liste atadim
		
		for (String string : arr) {
			System.out.print(string); 
		}
		System.out.println("");
		System.out.println(itemList);
		System.out.println("");
		
		
		
		
		String arr2 [] = {"a","b","c"};
		 
		List <String> list1 = Arrays.asList(arr2); // list e array atadim

		// list1.add("d"); Uzunlugu degistirilemeyen bir liste olur yani add, remove, cleari kullanamazsin
		
		list1.set(1, "d"); // yapilan degisiklik array i de etkiler
		arr2[0]="z";       // yapilan degisiklik list i de etkiler
		
		System.out.println(list1);
		System.out.println(Arrays.toString(arr2));
		
		
	}

}
