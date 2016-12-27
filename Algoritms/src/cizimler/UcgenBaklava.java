package cizimler;

import javax.swing.*;

public class UcgenBaklava {
	
	public static void main(String[] args) {
		/**
		 * 
		 */
		int boyut=7;
		
		for (int i = 1; i <= boyut; i++) {
			
			int yildizSay=0;
			int bosluk=0;
			
			yildizSay= i<=(boyut/2+1) ? (2*i-1): 2*(boyut-i)+1 ;
			
			
			bosluk= (boyut-yildizSay)/2;
			
			
			for (int j = 0; j < bosluk; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <yildizSay; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
