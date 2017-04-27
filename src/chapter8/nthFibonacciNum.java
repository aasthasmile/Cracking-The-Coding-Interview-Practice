package chapter8;

import java.util.Scanner;

public class nthFibonacciNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();
			System.out.println("Fibonacci :" + nthFibonacci(n));
		}
	}

	private static int nthFibonacci(int n) {

		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else if (n > 1)
			return nthFibonacci(n - 1) + nthFibonacci(n - 2);

		return -1;

	}

}
