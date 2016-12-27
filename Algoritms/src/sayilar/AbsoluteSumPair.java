package sayilar;


public class AbsoluteSumPair {

	public static void main(String[] args) {
		int[] arr = { -10, -5, 3, 15, 16, 23 };
		AbsoluteSumPair absoluteSumPair= new AbsoluteSumPair();
		absoluteSumPair.minAbsSumPair(arr, arr.length);
	}

	public void minAbsSumPair(int arr[], int arr_size) {

		int min_sum, sum, min_l, min_r;

		min_l = 0;
		min_r = 1;
		min_sum = arr[0] + arr[1];
		
		 for(int i = 0; i < arr_size ; i++)
		  {
		    for(int k=i+1; k < arr_size; k++)
		    {
		      sum = arr[i] + arr[k];
		      
		      if(Math.abs(min_sum) > Math.abs(sum))
		      {
		        min_sum = sum;
		        min_l = i;
		        min_r = k;
		      }
		    }
		  }
		 
		 System.out.println(min_l+" "+ min_r);
	}
}
