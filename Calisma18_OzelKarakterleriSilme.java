package calismaAlani;

public class Calisma18_OzelKarakterleriSilme {

	public static void main(String[] args) {
		
		 String str="This#string%contains^special*characters&.$65.13";
		 str = str.replaceAll("[^a-z A-Z 0-9]"," ");
		 System.out.println(str);
		 
		 String str1="This#string%contains^special*characters&.$65.13";
		 str1 = str1.replaceAll("\\W", " ");
		 System.out.println(str1);
		 
		 String str2="This#string%contains^special*characters&.$65.13";
		 str2 = str2.replaceAll("[^ 0-9 .]", " ");
		 System.out.println(str2);

	}

}
