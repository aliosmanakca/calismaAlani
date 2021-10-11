package calismaAlani;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calisma16_varargs_ve_array {
	static Scanner scan = new Scanner(System.in);
	static String str = "";

	public static void main(String[] args) {

		List<Integer> liste = new ArrayList<>();

		do {
			System.out.println("bir sayi girin");
			int sayi = scan.nextInt();
			liste.add(sayi);
			System.out.println("baska bir sayi daha girmek icin e ye basin yoksa h ye basin");
			scan.nextLine();
			str = scan.nextLine();

		} while (str.equalsIgnoreCase("e"));

		Integer[] arr = liste.toArray(new Integer[0]);// arr'ye liste'yi atadim

		System.out.println(varargsTopla(arr));

	}

	private static int varargsTopla(Integer... i) { 
        int toplam = 0;
        for (int w : i) {
            toplam += w;
        }
        return toplam;  

	}

}
