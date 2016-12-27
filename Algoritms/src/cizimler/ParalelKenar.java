package cizimler;

public class ParalelKenar {

	public static void main(String[] args) {

		int boyut = 5;

		for (int i = 1; i <= boyut; i++) {

			int yildizCount = 0;
			int boslukCount = 0;

			yildizCount = boyut;
			boslukCount = boyut - i;

			for (int j = 0; j < boslukCount; j++) {
				System.out.print("-");
			}
			for (int j = 0; j < yildizCount; j++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
	}
}
