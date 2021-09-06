package Obligatorisk_1;

import static javax.swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(showInputDialog("Velg et tall du vil finne fakulteten av"));
		int resultat = 1;
		int temp = n;
		
		while (temp > 1) {
			resultat *= temp;
			temp--;
		}
		
		showMessageDialog(null, n + "! blir " + resultat);
	}

}
