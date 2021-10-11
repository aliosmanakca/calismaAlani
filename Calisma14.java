package calismaAlani;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calisma14 {

	// bir sayidan sonraki ilk 10 asal sayiyi bulma

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayi girin");
		int sayi = scan.nextInt();
		int temp = 0;

		List<Integer> sayilar = new ArrayList();

		while (sayilar.size() < 10) {

			boolean asal = true;
			sayi++;

			for (int i = 2; i < sayi; i++) {
				temp = sayi % i;
				if (temp == 0) {
					asal = false;
				}
			}

			if (asal == true) {
				sayilar.add(sayi);
			}

		}

		System.out.println(sayilar);
scan.close();
	}

}
