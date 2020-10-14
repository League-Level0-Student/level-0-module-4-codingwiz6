package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class Score {
public static void main(String[] args) {
	String score=JOptionPane.showInputDialog("What is your test score?");
	int scores=Integer.parseInt(score);
	double scoress=scores;
	if(scoress>80) {
		JOptionPane.showMessageDialog(null, "Wow! Good job! You got 80+");
	}
	else if(scoress<80 && scoress > 60){
		JOptionPane.showMessageDialog(null, "Nice! You scored ok. But you got 60+");
	}
	else if(scoress<60) {
		JOptionPane.showMessageDialog(null, "You got 60-");
	}
}
}
