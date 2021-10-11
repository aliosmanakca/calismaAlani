package calismaAlani;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Calisma17_Set {

	public static void main(String[] args) {
		// Array deki tekrar eden elementleri set kullanarak silen bir method olustur
		
		int arr[]= {1,1,2,3,4,4,4,5,6,6};
		
		int yeniarr [] =tekrarlariSil(arr);
		System.out.println(Arrays.toString(yeniarr));

	}

	public static int[] tekrarlariSil(int[] a) {
		
		Set<Integer> set=new HashSet<>();
		for (Integer each : a) { 
			set.add(each); 
		}
		
		int newarr[]= new int[set.size()];
		int index=0;
		for (int w : set) {
			newarr[index]=w;
			index++;
		}
		
		return newarr;  
		
	}

}
