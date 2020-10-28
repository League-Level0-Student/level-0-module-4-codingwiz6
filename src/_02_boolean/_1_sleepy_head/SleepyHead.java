package _02_boolean._1_sleepy_head;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend = false;
		// Write code to ask the user what day it is.
        String day= JOptionPane.showInputDialog("What day is it?");
		// Set the boolean isWeekend based on the value they enter
		if(day.equalsIgnoreCase("Saturday")|| day.equalsIgnoreCase("Sunday")) {
			isWeekend = true;
		}
		else {
			isWeekend=false;
		}
		
		// If it is the weekend, tell the user they get to sleep in.
		if(isWeekend == true) {
			JOptionPane.showMessageDialog(null, "Yay! It is the weekend! You get to sleep in!");
		}
		// If it is not the weekend, tell them to get out of bed and go to school!
		if(isWeekend == false) {
			JOptionPane.showMessageDialog(null, "It is not the weekend. Get going with schoolwork!");
		}
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam
		String exam=JOptionPane.showInputDialog("What was your last test score?");
		int numexam =Integer.parseInt(exam);
		// If they scored more than 70, they passed the exam.
		if(numexam>70) {
			// Set the boolean passedExam based on their score.
		passedExam=true;
		}
		else {
			passedExam=false;
		}
		// If the user passed the exam, congratulate them
		if(passedExam==true) {
			JOptionPane.showMessageDialog(null, "Congratulations! You passed the exam!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Hmm...you didn't really get a high grade. ");
		}
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			// If they answer "yes", change gameIsOver to true
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			else {
				gameIsOver=false;
			}
			

		}
		// Tell the user "game is over" 
		JOptionPane.showMessageDialog(null, "Yay!");
		
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String Red=JOptionPane.showInputDialog("What color do you want to draw with?");
		if(Red.equalsIgnoreCase("red")) {
			isRed=true;
		}
		else {
			isRed=false;
		}
	
	
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		boolean isSquare;
		String Shape=JOptionPane.showInputDialog("What shape do you want draw?");
		if(Shape.equalsIgnoreCase("square")) {
		isSquare=true;	
		}
		else {
			isSquare=false;
		}
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		if(isRed==true && isSquare==true) {
			drawRedSquare();
		}
		// otherwise, tell the user you don't know how to draw that shape
		else {
			JOptionPane.showMessageDialog(null,"Sorry I don't know how to draw that :(");
		}

	}

	
	static void drawRedSquare() {
		Robot rob = new Robot();
		// Complete the rest of this method
rob.setPenColor(Color.RED);
rob.penDown();
rob.move(150);
rob.turn(90);
rob.move(150);
rob.turn(90);
rob.move(150);
rob.turn(90);
rob.move(150);
		
	}	
}
