package Obligatorisk_1;

import static javax.swing.JOptionPane.*;

public class O1 {

	public static void main(String[] args) {
		
		final int trinn1 = 184800;
		final int trinn2 = 260100;
		final int trinn3 = 651250;
		final int trinn4 = 1021550;
		
		final double sats1 = 0.017;
		final double sats2 = 0.04;
		final double sats3 = 0.132;
		final double sats4 = 0.162;
		
		double skatt = 0;
		double netto = 0;
		double brutto = Double.parseDouble(showInputDialog("Skriv inn din inntekt"));
		double temp = brutto;
		
		if (temp >= trinn4) {
			skatt += (temp - trinn4)*sats4;
			temp = trinn4;
		
		}
		if (temp >= trinn3) {
			skatt += (temp - trinn3)*sats3;
			temp = trinn3;
		
		}
		if (temp >= trinn2) {
			skatt += (temp - trinn2)*sats2;
			temp = trinn2;
		
		}
		if (temp >= trinn1) {
			skatt += (temp - trinn1)*sats1;
		
		}
		
		netto = brutto - skatt;
		showMessageDialog(null, "Din brutto er " + brutto + "\nDu betaler " + skatt + " i skatt\n" + "Din netto blir da " + netto);
		
	}

}
