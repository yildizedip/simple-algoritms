package strings;

public class LongestPalindrome {

	public static void main(String[] args) {
		String aaa = "skabakc";
		System.out.println(aaa.substring(1,3));
		char[] str = aaa.toCharArray();
		int longestStart = 0;
		int longestEnd = 0;
		
		//isPalindrome(str, 1, 5);

		for (int start = 0; start < str.length; start++) {
			for (int end = start + 1; end <= str.length; end++) {
				if (isPalindrome(str, start, end - 1)) {

					if (end - start > longestEnd - longestStart) {
						longestEnd = end;
						longestStart = start;
					}
				}
			}
		}

		System.out.println(aaa.substring(longestStart, longestEnd));

	}

	private static boolean isPalindrome(char[] str, int start, int end) {
		for (int i = start; i <= (start + end) / 2; i++) {
			if (str[i] == str[start + end - i])
				continue;
			else
				return false;
		}

		return true;
	}

}
