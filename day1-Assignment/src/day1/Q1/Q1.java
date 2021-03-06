package day1.Q1;

/* Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n), where 
F(n)=F(n?1)+F(n?2) and F(1)=F(2)=1. Also compute their average. The output shall look like:
The first 20 Fibonacci numbers are:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
The average is 885.5*/

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 1;
		int number2 = 1;
		int number3 = 0;
		float average = number1 + number2;
		System.out.println("The first 20 Fibonacci numbers are:");
		System.out.print(number1 + " " + number2);
		for (int i = 0; i < 18; i++) {
			number3 = number1 + number2;
			average += number3;
			System.out.print(" " + number3);
			number1 = number2;
			number2 = number3;
		}
		average /= 20;
		System.out.println();
		System.out.println("The average is " + average);

	}

}
