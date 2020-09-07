package uke35a;

import static javax.swing.JOptionPane.*;

public class trinnskatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double brutto = Double.parseDouble(showInputDialog("Hva er din bruttoinntekt?"));
		
		double prosent;
		if (brutto < 180800) prosent = 0; else
		if (brutto <= 254500) prosent = 0.019; else
		if (brutto <= 639750) prosent = 0.042; else
		if (brutto <= 999550) prosent = 0.132; else
			prosent = 0.162;
		
		double trinnskatt = brutto * prosent;
			
	System.out.println("Trinnskatten din er: " + trinnskatt);	
		
	}

}
