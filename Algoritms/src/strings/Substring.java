package strings;

public class Substring {
	
	public static void main(String[] args) {
		String str1="armut";
		String str2="tarum";
		
		boolean sss=isRotate(str1,str2);
		System.out.println(sss);
	}

	private static boolean isRotate(String str1, String str2) {
		if(str1.length()!=str2.length()) return false;
		
		String concat= str1+str1;
		
		return isSubstring(concat,str2);
		
			
	}

	private static boolean isSubstring(String concat, String str2) {
		
		int[] siralama=new int[str2.length()];
		
		for (int i = 0; i < str2.length(); i++) {
			char c= str2.charAt(i);
			
			for (int j = i+1; j < concat.length(); j++) {
				char cc=concat.charAt(j);
				if(c==cc){ 
					siralama[i]=j;
				break;
				}
			}
		}
		
		for (int i = 0; i < siralama.length; i++) {
			for (int j = i+1; j < siralama.length; j++) {
				if(siralama[i]>siralama[j]){
					return false;
				}
			}
		}
		return true;
	}
	

}
