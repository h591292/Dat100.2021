package no.hvl.dat100;
import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;

public class OppgaveB1 {

	public static void main(String[] args) {
		
		int x;
		int n;
		double resultat = 1.0;
		
		x = Integer.parseInt(showInputDialog("Vel et tall"));
		n = Integer.parseInt(showInputDialog("Vel en potens"));
		
		for (int i = 1; i <= n; i++) {
			resultat *= x;
		}
		
		showMessageDialog(null, x + " opphøyd i " + n + " blir: " + resultat);
		
		

	}

}
