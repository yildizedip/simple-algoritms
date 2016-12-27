package recursives;

public class Recursive1 {

	public static void main(String[] args) {

		Recursive1 recursive1 = new Recursive1();
		recursive1.rec("s");
		System.out.println(recursive1.carp(6));
	}

	public void rec(String str) {
		if (str.equals("ssss")) {
			System.out.println("dd");
			return;
		} else {

			System.out.println(str);
			rec(str + "s");
			System.out.println(str);
			return;
		}

	}

	public int carp(int x) {

		if (x == 1)
			return 1;

		return x * carp(x - 1);

	}
}
