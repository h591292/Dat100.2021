package Obligatorisk_1;

import static javax.swing.JOptionPane.*;

public class O2 {

	public static void main(String[] args) {
		
		int poengsum = 0;
		String karakter = "";
		
		for (int i = 1; i < 11; i++) {
		
			do {
				
				if (poengsum > 100 || poengsum < 0) {
					showMessageDialog(null, "Ugyldig poengsum, skriv inn på nytt");
				}
				
				poengsum = Integer.parseInt(showInputDialog("Skriv inn poengsummen din"));
			
				if (poengsum <= 100 && poengsum >= 90) {
					karakter = "A";
				}
				if (poengsum <= 89 && poengsum >= 80) {
					karakter = "B";
				}
				if (poengsum <= 79 && poengsum >= 60) {
					karakter = "C";
				}
				if (poengsum <= 59 && poengsum >= 50) {
					karakter = "D";
				}
				if (poengsum <= 49 && poengsum >= 40) {
					karakter = "E";
				}
				if (poengsum <= 39 && poengsum >= 0) {
					karakter = "F";
				}
				
				} while (poengsum > 100 || poengsum < 0);
		
			showMessageDialog(null, "Din poengsum på " + poengsum + " gir deg karakteren " + karakter);
		
		 
				}
		}
	}
