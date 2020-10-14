package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String money=JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
int numNickels = Integer.parseInt(money);
		// Ask the user how many dimes they have, and convert their answer
String dime=JOptionPane.showInputDialog("How many dimes do you have?");
int numDimes = Integer.parseInt(dime);
		// Ask the user how many quarters they have, and convert their answer
String quart=JOptionPane.showInputDialog("How many quarters do you have?");
int numQuart = Integer.parseInt(quart);
		// Calculate how much money the user has.  Hint: Use a double variable 
double doubleNickels = numNickels*.05;
double doubleDimes=numDimes*.10;
double doubleQuart=numQuart*.25;
double total = doubleNickels+doubleDimes+doubleQuart;
JOptionPane.showMessageDialog(null, "You have $"+total);
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

