package recursives;

public class ToplamSayi {

	
	public static void main(String[] args) {
		System.out.println(topla(6));
	}
	
	static int topla(int say){
		
		if(say==0)return 0;
				
		return say + topla(say-1);
		
	}
}
