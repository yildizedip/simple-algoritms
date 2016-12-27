package sayilar;

public class Knapsack {

	static int[] values = new int[] { 10, 200, 2200, 100, 1 };
	static int[] weights = new int[] { 8, 6, 4, 1, 21 };
	static int W = 30;

	private static int knapsack(int i, int W) {
		if (i < 0) {
			return 0;
		}
		int elementWeight=weights[i] ;
		if (elementWeight>W) {
			return knapsack(i - 1, W);
		} else {
			
			int fark=W - weights[i];
			int deger=values[i];
			return Math.max(knapsack(i - 1, W), knapsack(i - 1, fark)+ deger);
		}
	}

	public static void main(String[] args) {
		
		int[] values = new int[] {80, 25, 40, 30, 200};
	    int[] weights = new int[] {8, 6, 4, 0, 21};
	    int W = 30;
	    int[] tab = new int[W+1];
	    System.out.println(knapsack1(values, weights, W, tab, 0));
		
	//	System.out.println(knapsack(weights.length - 1, W));
	}
	
	static int knapsack1(int[] values, int[] weights, int W, int[] tab, int i) {
	    if(i>=values.length) return 0;
	    if(tab[W] != 0) 
	        return tab[W];      

	    int value1 = knapsack1(values, weights, W, tab, i+1);        
	    int value2 = 0;
	    if(W >= weights[i]) value2 = knapsack1(values, weights, W-weights[i], tab, i+1) + values[i];

	    return tab[W] = (value1>value2) ? value1 : value2;
	}
	

}
