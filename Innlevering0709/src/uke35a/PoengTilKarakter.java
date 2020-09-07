package uke35a;

import static javax.swing.JOptionPane.*;

public class PoengTilKarakter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = Integer.parseInt(showInputDialog("Hva er din poengsum?"));
		if (score < 0 || score > 100) {
			showMessageDialog(null, "Dette funker ikke");
			return;
		}
		String karakter;
		if (score < 40) karakter = "Totalt håpløs"; else
		if (score < 50) karakter = "E"; else
		if (score < 60) karakter = "D"; else
		if (score < 80) karakter = "C"; else
		if (score < 90) karakter = "B"; else
			karakter = "A";
		showMessageDialog(null, ("Du fikk karakteren: " + karakter));
	}

}
