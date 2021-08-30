package calismaAlani;

import java.util.Scanner;

public class Calisma05 {
	
	public static void main(String[] args) {
	
		//belirli bir(kullanıcı girecek)  yükseklikten bir top serbest dusme ile bırakilımaktadir.
	    // top serbest bırakıldıktan  sonra sürekli birakildigi yüksekliğin % 75 'İ kadar zeminden yukarı doğru zıplamaktadır
	    // Top zıplama  yüksekliği 1 metrenin altına indiğinde olay sonlandirilmaktadir.
	    // Bu ana kadar topun toplam aldığı yolu ve topun zemine  vurma sayısını bulunuz.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("yukseklik girin cm");
		double mesafe=scan.nextDouble();
		double toplam=0;
		int count=0;
		
		do { 
			toplam+=mesafe+mesafe*0.75;  
			mesafe=mesafe*0.75;
			
			count++;
			
		} while (mesafe>100);  
		
		
		System.out.println("carpma sayisi : "+count+" toplam yol : "+(int)(toplam-mesafe)); 
		//en sonda toplamdan mesafe cikarilmali cunku mesafe en son 100 un altinda kaliyor

		scan.close();
	
		
		
	}

}
