package sayilar;

public class Obeb {

	public static void main(String[] args) {
		int say1=12;
		int say2=18;
		
		int obeb=0;
		for (int i = 2; i <= say1*say2; i++) {
			if(say1%i==0 && say2%i==0){
				obeb=i;
				break;
			}
		}
		System.out.println(obeb);
	}
}
