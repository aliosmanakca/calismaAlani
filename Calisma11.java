package calismaAlani;

import java.util.Arrays;

public class Calisma11 {

	public static void main(String[] args) {

		// iki arrayi birlestirme methodu
		
		int [] arr1 = {1,2,3,4};
		int [] arr2 = {5,6};
		
		System.out.println(Arrays.toString(sonuc(arr1,arr2)));
	}

	private static int[] sonuc(int[] arr1, int[] arr2) {
		int arr3 [] = new int[arr1.length+arr2.length];
		int count =0;
		for (int each : arr1) {
			arr3[count]=each;
			count++;
		}
		for (int each : arr2) {
			arr3[count]=each;
			count++;
		}
		return arr3; 
	}


}
