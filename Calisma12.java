package calismaAlani;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calisma12 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		// bir stringdeki en cok tekrar eden karakterleri bulma

		Scanner scan = new Scanner(System.in);
		System.out.println("bir yazi yazin");
		String str = scan.nextLine();
		String arr[] = str.split(""); // stringi array e cevirdim

		List<String> temp = new ArrayList();

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			int tempcount = 0;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i].equalsIgnoreCase(arr[j])) {
					tempcount++;
					if (tempcount >= count) {
						count = tempcount;
						if (!temp.contains(arr[i])) {
							temp.add(arr[i]);
						}
					}

				}
			}

		}

		System.out.println(temp);
		scan.close();
	}

}
