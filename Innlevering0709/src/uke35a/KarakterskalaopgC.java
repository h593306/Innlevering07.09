package uke35a;

	import static javax.swing.JOptionPane.*;
	import static java.lang.Integer.*;
	
public class KarakterskalaopgC {

		public static void main(String[] args) {

			for (int antStudenter = 1; antStudenter <= 10;) {
				String tallTxt = showInputDialog("Oppgi poengsum: ");
				int poeng = parseInt(tallTxt);
			
				if ((poeng>=0)&&(poeng<=39)) {
					String utTxt = "Student nummer " + antStudenter + " av 10" + "\nDu har oppnådd karakter F";
					antStudenter++;
					showMessageDialog(null, utTxt);
				}
				if ((poeng>=40)&&(poeng<=49)) {
					String utTxt = "Student nummer" + antStudenter + " av 10" + "\nDu har oppnådd karakter E";
					antStudenter++;
					showMessageDialog(null, utTxt);
				}
				if ((poeng>=50)&&(poeng<=59)) {
					String utTxt = "Student nummer" + antStudenter + " av 10" + "\nDu har oppnådd karakter D";
					antStudenter++;
					showMessageDialog(null, utTxt);
				}
				if ((poeng>=60)&&(poeng<=79)) {
					String utTxt = "Student nummer " + antStudenter + " av 10" + "\nDu har oppnådd karakter C";
					antStudenter++;
					showMessageDialog(null, utTxt);
				}
				if ((poeng>=80)&&(poeng<=89)) {
					String utTxt = "Student nummer" + antStudenter + " av 10" + "\nDu har oppnådd karakter B";
					antStudenter++;
					showMessageDialog(null, utTxt);
				}
				if ((poeng>=90)&&(poeng<=100)) {
					String utTxt = "Student nummer" + antStudenter + " av 10" + "\nDu har oppnådd karakter A";
					antStudenter++;
					showMessageDialog(null, utTxt);
				}
				if((poeng>100)&&(poeng<0)) {
					String utTxt = "Student nummer " + antStudenter + " av 10" + "\nUgyldig poengsum";
					showMessageDialog(null, utTxt);
				}
			}
			
		}

	}

