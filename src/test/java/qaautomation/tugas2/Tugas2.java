package qaautomation.tugas2;

import java.util.Scanner;

public class Tugas2 
{
	public static void Calculation(double a, double b , char operator)
	{double c;
		switch (operator)
		{
		case '+':c=a+b;
		System.out.println(c);
		break;
		case '-':c=a-b;
		System.out.println(c);
		break;
		case '*':c=a*b;
		System.out.println(c);
		break;
		case '/':c=a/b;
		System.out.println(c);
		break;
		}
		
	}
	public static void main(String []args) 
	{
		try {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("SIMPLE CALCULATOR for +, -, *, /");
			System.out.println("Use Format: A + B. Then Push ENTER");

			double aa=s.nextDouble();
			char cc=s.next().charAt(0);
			double bb=s.nextDouble();
			Calculation(aa, bb, cc);
		}
	} catch (Exception e) {
		System.out.println("Terjadi Kesalahan");
	}
	System.out.println("Thanks!");
	}
	
}
