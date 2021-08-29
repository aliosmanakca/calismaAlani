package calismaAlani;

import java.util.Scanner;

public class Calisma04 {
      
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.println("enter num1");
	    int num1=scan.nextInt();
	    System.out.println("enter num2");
	    int num2=scan.nextInt();
	    
	    int gcd=1;
	    int sayi1=num1;
	    int sayi2=num2;
	    
	    for (int bolen=2; bolen<sayi1 || bolen<sayi2; bolen++)  {    
	    	 
	    	while (sayi1%bolen==0  && sayi2%bolen==0) {    
	    		sayi1/=bolen;  
	    		sayi2/=bolen; 
	    		gcd*=bolen; 
	    		
	    		}
	    		 	 
	    }
	    
	    int kalan1=sayi1%gcd;
	    int kalan2=sayi2%gcd; 
	    int lcm = 1;  
	    if (kalan1>0 && kalan2>0)  {
	    	 lcm=kalan1*kalan2*gcd;
	    }
	    else if (kalan1==0 && kalan2>0)  {
	    	 lcm=kalan2*gcd;
	    }
	    else if (kalan1>0 && kalan2==0)  {
	    	 lcm=kalan1*gcd;
	    }
	    else if (kalan1==0 && kalan2==0)  {
	    	 lcm=gcd;
	    }
	    
	    System.out.println("GCD for "+num1+" and "+num2+" = "+gcd); 
	    System.out.println("LCM for "+num1+" and "+num2+" = "+lcm);   
		
scan.close();		
}
	
}