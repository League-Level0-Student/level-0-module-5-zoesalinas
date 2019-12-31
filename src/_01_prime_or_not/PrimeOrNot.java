package _01_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("Type in a number and we will tell you if it is prime or not!");
	int num = Integer.parseInt(input);
	for (int i = 2; i < num ; i++) {
		if (num%i==0) {
			System.out.println("notPrime");
			System.exit(0);
		}
	}
	System.out.println("prime");
	
	
	
	
}
}
