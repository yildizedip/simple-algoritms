package sayilar;

public class Cuttingrod {
	
	public static void main(String[] args) {
		 int arr[] = {1, 5, 8, 9, 10, 17, 20};
		 int size= 7;
		 
		 int ss=cutRod(arr, size);
		 System.out.println(ss);
	}

	private static int cutRod(int[] price, int n) {
		
		if (n <= 0)
		     return 0;
		   int max_val = 0;
		 
		   // Recursively cut the rod in different pieces and compare different 
		   // configurations
		   for (int i = 0; i<n; i++)
		         max_val = Math.max(max_val, price[i] + cutRod(price, n-i-1));
		 
		   return max_val;
		
	}

}
