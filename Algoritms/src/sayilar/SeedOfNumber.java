package sayilar;


public class SeedOfNumber {

	public static void main(String[] args) {
		
		int count=0;
		
		for (int i = 100; i < 1000; i++) {
			if(!aynimi(i)){
				System.out.println(i);
				count++;
			}
		}
		System.out.println("toplam : "+count);
		
		
		seedNumber(123);
		
	}

	private static void seedNumber(int sayi) {

	int s1=	((sayi%1000)-(sayi%100))/100; // yuzler basmagindaki sayi
	int s2=	((sayi%100)-(sayi%10))/10;
	int s3=	((sayi%10)-(sayi%1))/1;
	System.out.println("seed:"+sayi*s1*s2*s3);
	
	}

	public static boolean aynimi(int sayi){
		
		int m1= ( (sayi%1000)-(sayi%100) )/100;
		int m2=  ( (sayi%100)-(sayi%10) )/10;
		int m3= ( (sayi%10)-(sayi%1) ) /1;
			
		if(m1==m2 || m2==m3 || m1==m3 ) return true;
		else  return false;
	}

}
