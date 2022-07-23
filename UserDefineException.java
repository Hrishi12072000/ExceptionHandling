package User_Define_Exception;

import java.util.Scanner;

public class UserDefineException 
{
	static int age;
	public static void main(String[] args)
	{
	
	}
		public static void exception()
		{
			int num1,num2,res,age;
			Scanner sc=new Scanner(System.in);
			
			try
			{
				int  marks[]=new int[10];
				marks[45]=567;
				System.out.println("Error"+marks[45]);
				try
				{
					num1=sc.nextInt();
					num2=sc.nextInt();
					res=num1/num2;
					System.out.println("The value is"+res);
					System.out.println("Enter your age");
					age=sc.nextInt();
					if(age<18)
					{
						System.out.println("You are not eligible for vote");
					}
					else
					{
						System.out.println("You are eligible for vote");

					}
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println("Array size should not be greater than 10 or negative"+e.getMessage());
				}
			}
			catch(ArithmeticException e) 
			{
				System.out.println("Array size should not be greater than 10 or negative"+e.getMessage());
			}
			
		}
}
