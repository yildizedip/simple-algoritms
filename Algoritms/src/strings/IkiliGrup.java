package strings;

public class IkiliGrup {

	public static void ikiligrup(String kelime) {
		String yeni = "";
		for (int i = 0; i < kelime.length(); i++) {
			yeni = yeni + kelime.charAt(i) + kelime.charAt(i) + " ";

		}
		System.out.println(yeni);

	}

	public static void main(String[] args) {

		ikiligrup("samime");
	}

}
