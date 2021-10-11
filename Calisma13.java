package calismaAlani;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Calisma13 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		// bir stringdeki tum karakterlerin kac defa tekrar ettigini bulma

		Scanner scan = new Scanner(System.in);
		System.out.println("bir yazi yazin");
		String str = scan.nextLine();
		String arr[] = str.split(""); // stringi array e cevirdim
		List<String> temp = new ArrayList();

		TreeMap<String, Integer> map = new TreeMap();

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {

				if (arr[i].equalsIgnoreCase(arr[j])) {
					count++;
					if (!temp.contains(arr[i])) {
						temp.add(arr[i]);
					}
				}
			}
			map.put(arr[i], count);
		}

		System.out.println(map);
		
scan.close();

	}
}
