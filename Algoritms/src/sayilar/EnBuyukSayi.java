package sayilar;

public class EnBuyukSayi {

	public static void main(String[] args) {
		
		
		
		int[] sayilar = {  100, 5,22,4,99};
		
		

		for (int k = 0; k < sayilar.length; k++) {
			for (int i = 0; i < sayilar.length; i++) {
				int say1 = sayilar[i];
				if(i+2 >sayilar.length)break;
				int say2 = sayilar[i + 1] ;
				if (say1 < say2) {
					sayilar[i] = say2;
					sayilar[i+1]=say1;
				}
			}
		}

//		for (int i = 0; i < sayilar.length; i++) {
//			System.out.println(sayilar[i]);
//		}
		
		
		int enKucuk=sayilar[0];
		for (int i = 0; i < sayilar.length; i++) {
			int say=sayilar[i];
			if (say < enKucuk) {
				enKucuk = say;
			}
		}
		
		System.out.println(enKucuk);
	}

}
