package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		String hi = JOptionPane.showInputDialog("Pick a number.");
		int hi2 = Integer.parseInt(hi);
		for(int i = 2; i<hi2;i++) {
			if(hi2%i==0) {
				JOptionPane.showMessageDialog(null, "Your number is not prime. You have wasted my time. ");
				System.exit(0);
			}
			JOptionPane.showMessageDialog(null, "Your number is prime.");
			}
			
		}
		
	}


