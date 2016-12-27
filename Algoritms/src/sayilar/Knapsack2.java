package sayilar;

public class Knapsack2 {

    public static void main(String[] args) {
        int[] arr = new int[]{11, 8, 7, 6, 5};
        System.out.println(find(arr,0,13));
    }

    private static boolean find( int[] arr,int start,  int total){
        if (start == arr.length){
            return false;
        }
        int curr = arr[start];
        int fark=total-curr;
        if (curr == total){
            System.out.println(curr);
            return true;
        }else if (curr > total || !find(arr,start+1,fark)){
            return find(arr,start+1,total);
        }
        System.out.println(curr);
        return true;
    }
}
