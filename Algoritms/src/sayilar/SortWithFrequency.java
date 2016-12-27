package sayilar;

public class SortWithFrequency {

	public static void main(String[] args) {
		
		int[] dizi = { 2, 3, 4, 2, 1, 8, 1, 2, 4 };

		int[][] diziler = new int[dizi.length][];

		for (int i = 0; i < dizi.length; i++) {

			int say = dizi[i];

			int freq = 0;

			for (int j = 0; j < dizi.length; j++) {
				if (say == dizi[j]) {
					freq++;
				}
			}

			int[] ic=new int[2];
			ic[0]=say;
			ic[1]=freq;
			diziler[i] = ic;

		}
		System.out.println(".");
//		 for (int i = 0; i < dizi.length; i++) {
//		 for (int j = i + 1; j < dizi.length; j++) {
//		 int say1 = dizi[i];
//		 int say2 = dizi[j];
//		 if(say1==say2){
//		 int temp=dizi[i+1];
//		 dizi[i+1]=say2;
//		 dizi[j]=temp;
//		 }
//		 // System.out.println(say1 + " " + say2);
//		 }
//		
//		 }
//		 for (int i = 0; i < dizi.length; i++) {
//		 System.out.println(dizi[i]);
//		 }
	}

}
