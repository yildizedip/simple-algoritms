package strings;

public class IsUniqueChar {

	public static void main(String[] args) {
		System.out.println(isUniqueChar("b d"));
	}

	private static boolean isUniqueChar(String string) {
		int[] charArry = new int[256];

		boolean uniqe = true;

		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if (charArry[c] == 0)
				++charArry[c];
			else
				uniqe = false;
		}

		return uniqe;
	}

}
