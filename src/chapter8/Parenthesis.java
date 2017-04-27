package chapter8;

import java.util.ArrayList;
import java.util.Scanner;

public class Parenthesis {

	static ArrayList<String> sol = new ArrayList<>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		parenthesizations(number);
	}

	private static void parenthesizations(int number) {
		char[] str = new char[2 * number];
		printParentheziation(number, number, str, 0);

		for (int i = 0; i < sol.size(); i++) {
			System.out.println(i+" | "+sol.get(i) +" ");
		}
	}

	public static void printParentheziation(int leftp, int rightp, char[] str, int index) {
		if (leftp < 0 || rightp < 0 || leftp > rightp) {
			return;
		}
		if (leftp == 0 && rightp == 0)
			sol.add(String.valueOf(str));
		else {
			str[index] = '(';
			printParentheziation(leftp - 1, rightp, str, index + 1);

			str[index] = ')';
			printParentheziation(leftp, rightp - 1, str, index + 1);
		}
	}

}
