package recursives;

public class Faktoriyel {

	
	public static void main(String[] args) {
		
		
		Faktoriyel faktoriyel= new Faktoriyel();
		System.out.println(faktoriyel.faktoriyelBul(4));
	}
	
	private int faktoriyelBul(int sayi){
		 if(sayi==1) return 1;
		return sayi*faktoriyelBul(sayi-1);
	}
}
