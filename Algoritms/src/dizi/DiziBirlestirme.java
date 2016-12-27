package dizi;

public class DiziBirlestirme {

	public static void main(String[] args) {
		int dizi1[] = { 1, 2, 7, 12 };
		int dizi2[] = { 3, 14, 18, 25, 26 };
		int[] yeni_dizi = new int[dizi1.length + dizi2.length];
		int a = 0, b = 0, c = 0;
		int count=0;
//		while (a < dizi1.length || b < dizi2.length) {
//			System.out.println(count++);
//			if (a < dizi1.length && dizi1[a] < dizi2[b]) {
//				yeni_dizi[c] = dizi1[a];
//				a++;
//			} else {
//				yeni_dizi[c] = dizi2[b];
//				b++;
//			}
//			c++;
//		}
		
		for (int i = 0; i < yeni_dizi.length; i++) {
			int say1=	dizi1[i];
			int say2=	dizi2[i];
			if(say1<say2){
				yeni_dizi[i]=say1;
			}else yeni_dizi[i]= say2;
		}
		
		

		
		for (int i = 0; i < yeni_dizi.length; i++) {
			System.out.println(yeni_dizi[i]);
		}
	}
}
