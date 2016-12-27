package sayilar;

public class Sirala {

	public static void main(String[] args) {
		
		int yazilandeger=1;
		int j=0;
		
		for (int i = 1; i <= 10; i++) {
			for (j = 0; j < i; j++) {
				System.out.print(yazilandeger++ + ",");
			}
			System.out.println();
		}
		
	}

	
	public static void yaz(int say){
		if(say==7)return;
		
		int sondeger=1;
		
		for (int i = 0; i < say; i++) {
			
		}
		
		System.out.println();
		yaz(++say);
		
	}
}
