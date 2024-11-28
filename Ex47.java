package loops;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ex47 {

	public static void main(String[] args) {

		ArrayList<Double> grades = new ArrayList<>();

		int countA = 0, countB = 0, countC = 0, countD = 0, countE = 0;

		Double userGrade, arithmeticMean, sumGrade = 0.0;

		String userAnswer;

		do {

			userGrade = Double.parseDouble(JOptionPane.showInputDialog(null, "Input your grade: "));

			if (userGrade < 0) {

				JOptionPane.showMessageDialog(null, "Please input a positive value!");
			}

			else {

				grades.add(userGrade);
			}

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue?");

			userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

		for (int i = 0; i < grades.size(); i++) {

			if (grades.get(i) > 0 && grades.get(i) <= 2.9) {

				countE++;

			}

			else if (grades.get(i) >= 3.0 && grades.get(i) <= 4.9) {

				countD++;

			}

			else if (grades.get(i) >= 5.0 && grades.get(i) <= 6.9) {

				countC++;
			}

			else if (grades.get(i) >= 7.0 && grades.get(i) <= 8.9) {

				countD++;
			}

			else if (grades.get(i) >= 9.0 && grades.get(i) <= 10.0) {

				countA++;
			}

			else {

				JOptionPane.showMessageDialog(null, "Grade out of range, there is no concept.");
			}
		}

		JOptionPane.showMessageDialog(null,
				"Number of students: " + countA + " for grade A" + "\nNumber of students: " + countB + " for grade B"
						+ "\nNumber of students: " + countC + " for grade C" + "\nNumber of students: " + countD
						+ " for grade D" + "\nNumber of students: " + countE + " for grade E");

		for (int i = 0; i < grades.size(); i++) {

			sumGrade += grades.get(i);
		}

		arithmeticMean = sumGrade / grades.size();

		JOptionPane.showMessageDialog(null, "Total number of students: " + grades.size()
				+ "\nArithmetic mean of the class: " + Math.round(arithmeticMean));

	}

}
