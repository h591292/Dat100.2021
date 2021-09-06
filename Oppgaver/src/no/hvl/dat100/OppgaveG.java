package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
public class OppgaveG {

	public static void main(String[] args) {

		int nedre_grense = Integer.parseInt(showInputDialog("Nedre grense"));
		int ovre_grense = Integer.parseInt(showInputDialog("Øvre grense"));
		String resultat = ("");
		
		for(int i = nedre_grense; i <= ovre_grense; i++) {
			if(i % 2 == 1) {
				resultat += i;
				if (i < ovre_grense-1) {
					resultat += (", ");
				}
					
			}
		}
		
		showMessageDialog(null, resultat);
		
		
		
		
	    }
	  }