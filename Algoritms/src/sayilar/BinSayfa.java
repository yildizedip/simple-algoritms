package sayilar;

public class BinSayfa {
	
	public static void main(String[] args) {
		
		// bin sayfal�k bir kitab�n 10 sayfas�n� okumus.  her gun 5 sayfa okuyor. kac gunde bitirir.
		
		int kalan =1000;
		int gun=0;
		while(kalan>0){
			gun++;
			kalan= kalan-5;
		}
		
		System.out.println(gun);
		
	}
	
	

}
