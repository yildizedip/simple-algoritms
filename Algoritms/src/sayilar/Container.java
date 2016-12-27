package sayilar;

import java.util.ArrayList;
import java.util.Collections;

public class Container {
	
	static int toplam=0;
	static int weight=20;

	public static void main(String[] args) {

		Container container = new Container();
		container.getList();
		
		int[] boxWeightArray = { 8, 11, 12 };
		rec(boxWeightArray,0);

	}
	
	
	public static int rec(int[] dizi, int n){
		
		int say=dizi[n];
		int fark= weight-toplam;
		toplam= rec(dizi,n+1);
		
		return toplam;
		
		
	}

	public void getList() {

		int weight = 10;
		// int[] boxWeightArray={12,6,3,7,9,5,8};
		int[] boxWeightArray = { 8, 11, 12 };
		ArrayList<ContainerHolder> boxList = new ArrayList<ContainerHolder>();

		int toplam = 0;
		for (int i = 0; i < boxWeightArray.length; i++) {
			int val = boxWeightArray[i];
			toplam = val;
			int fark = weight - toplam;
			if (fark == 0) {
				System.out.println(val);
				break;
			} else if (fark > 0) {
				for (int j = i + 1; j < boxWeightArray.length; j++) {
					toplam = boxWeightArray[i] + boxWeightArray[j];
					fark = weight - toplam;
					if (fark > 0) {

					}
				}
			}

		}

		// for (int j = i + 1; j < boxWeightArray.length; j++) {
		//
		// ArrayList elemenetList = new ArrayList();
		// int sum = 0;
		// sum = boxWeightArray[i] + boxWeightArray[j];
		// elemenetList.add(boxWeightArray[i] + boxWeightArray[j]);
		//
		// int fark = weight - sum;
		//
		// if (fark >= 0) {
		// ContainerHolder containerHolder = new ContainerHolder();
		// containerHolder.fark = fark;
		// containerHolder.elementList = elemenetList;
		//
		// boxList.add(containerHolder);
		// }
		// }
		//
		// }
		//
		// Collections.sort(boxList);
		//
		// if (boxList.size() > 0) {
		// ContainerHolder c = boxList.get(0);
		// System.out.println(c);
		// } else
		// System.out.println("deger yok");

	}

	class ContainerHolder implements Comparable<ContainerHolder> {
		public int fark = 0;

		public int seviye = 0;
		public ArrayList elementList = new ArrayList();

		@Override
		public int compareTo(ContainerHolder c) {
			if (c.fark > this.fark)
				return -1;
			else if (c.fark == this.fark)
				return 0;
			else if (c.fark < this.fark)
				return 1;
			else
				return 0;
		}

	}

	public void minAbsSumPair(int arr[], int arr_size) {
		int min_sum, sum, min_l, min_r;
		min_l = 0;
		min_r = 1;
		min_sum = arr[0] + arr[1];

		for (int i = 0; i < arr_size; i++) {
			for (int k = i + 1; k < arr_size; k++) {
				sum = arr[i] + arr[k];
				if (Math.abs(min_sum) > Math.abs(sum)) {
					min_sum = sum;
					min_l = i;
					min_r = k;
				}
			}
		}
		System.out.println(min_l + " " + min_r);
	}

}
