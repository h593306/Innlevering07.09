package uke35a;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class KarakteropgB {

	public static void main(String[] args) {

		for (int antStudenter = 1; antStudenter <= 10; antStudenter++) {
			String tallTxt = showInputDialog("Oppgi poengsum: ");
			int poeng = parseInt(tallTxt);
		
			if ((poeng>=0)&&(poeng<=39)) {
				String utTxt = "Student nummer " + antStudenter + " av 10" + "\nDu har oppnådd karakter F";
				showMessageDialog(null, utTxt);
			}
			if ((poeng>=40)&&(poeng<=49)) {
				String utTxt = "Student nummer" + antStudenter + " av 10" + "\nDu har oppnådd karakter E";
				showMessageDialog(null, utTxt);
			}
			if ((poeng>=50)&&(poeng<=59)) {
				String utTxt = "Student nummer" + antStudenter + " av 10" + "\nDu har oppnådd karakter D";
				showMessageDialog(null, utTxt);
			}
			if ((poeng>=60)&&(poeng<=79)) {
				String utTxt = "Student nummer " + antStudenter + " av 10" + "\nDu har oppnådd karakter C";
				showMessageDialog(null, utTxt);
			}
			if ((poeng>=80)&&(poeng<=89)) {
				String utTxt = "Student nummer" + antStudenter + " av 10" + "\nDu har oppnådd karakter B";
				showMessageDialog(null, utTxt);
			}
			if ((poeng>=90)&&(poeng<=100)) {
				String utTxt = "Student nummer" + antStudenter + " av 10" + "\nDu har oppnådd karakter A";
				showMessageDialog(null, utTxt);
			}
			if((poeng>100)&&(poeng<0)) {
				String utTxt = "Student nummer " + antStudenter + " av 10" + "\nUgyldig poengsum";
				showMessageDialog(null, utTxt);
			}
		}
		
	}

}
