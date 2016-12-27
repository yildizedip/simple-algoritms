package recursives;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		// System.out.println(fibonacciStr(6));
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.fibo();
		
		int $y=0;
		int c=0;
		Scanner input = new Scanner(System.in);
		int i =input.nextInt();
		System.out.println(i);
		double d = input.nextDouble();
		System.out.println(d);
	}

	static int fibonacci(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fibonacci(n - 2) + fibonacci(n - 1);

	}

	public static String fibonacciStr(int n) {
		if (n == 0)
			return "";
		return fibonacciStr(n - 2);
	}

	public void fibo() {
		int a = 0;
		int b = 1;
		System.out.print(a+"-"+b);
		for (int i = 0; i < 10; i++) {
			int c = a + b;
			System.out.print("-"+ c);
			a=b;
			b=c;
			
		}

	}
}
