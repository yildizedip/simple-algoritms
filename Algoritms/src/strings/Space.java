package strings;

public class Space {

	public static void main(String[] args) {
		System.out.println(spaceReplacer("asfsa sfd a"));
	}

	private static String spaceReplacer(String string) {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if (c == ' ') {
				buffer.append("%20");
			} else {
				buffer.append(c);
			}
		}
		return buffer.toString();
	}
}
