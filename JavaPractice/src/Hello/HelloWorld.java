package Hello;

import java.util.Scanner;

public class HelloWorld
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter first number:");
		int firstNumber = s.nextInt();

		System.out.println("Enter second number:");
		int secondNumber = s.nextInt();

		if (firstNumber > secondNumber)
		{
			System.out.println("First number must not be greater than the second number.");
		}
		else
		{
			for (int i = firstNumber; i <= secondNumber; i++)
			{
				System.out.println(i);
			}
		}
		
		s.close();
	}

}
