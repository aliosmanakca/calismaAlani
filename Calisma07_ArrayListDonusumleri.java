package calismaAlani;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Calisma07_ArrayListDonusumleri {

	public static void main(String[] args) {
		
		//-----Array e liste atamak-----------
        List <String> itemList = new ArrayList<>();
		 
		itemList.add("item1");
		itemList.add("item2");
		itemList.add("item3");
 
		String[] arr = itemList.toArray(new String[0]); // array e liste atadim
		//2. yontem
        //Object arr [] = itemList.toArray();
		
		for (String string : arr) {
			System.out.print(string); 
		}
		System.out.println("");
		System.out.println(itemList);
		System.out.println("");
		
		//======================================================================================
		

		//------List e array atamak 1. yontem-----------
		String arr1 [] = {"a","b","c"};
		 
		List <String> list1 = Arrays.asList(arr1); // list e array atadim

		// list1.add("d"); Uzunlugu degistirilemeyen bir liste olur yani add, remove, cleari kullanamazsin
		
		list1.set(1, "d"); // yapilan degisiklik array i de etkiler
		arr1[0]="z";       // yapilan degisiklik list i de etkiler
		
		System.out.println(list1);
		System.out.println(Arrays.toString(arr1));
		System.out.println("");
		
		
		//-----List e array atamak 2. yontem-----------
		String arr2 [] = {"x","y","z"};
		List<String> list2 = new ArrayList<>(Arrays.asList(arr2)); // list e array atadim
		// bu yontemde listi istedigimiz gibi kullanabiliriz. Array ile birbirlerini etkilemezler
		list2.set(1, "r");
		arr2[0]="k";
		
		System.out.println(list2);
		System.out.println(Arrays.toString(arr2));
		
		
	}

}
