import java.util.Scanner;
	public class IT24100600Lab5Q1
	{
		public static void main(String[] args)
		{
			Scanner keyboard = new Scanner(System.in);
			
			System.out.print("Enter the first integer : ");
			int num1 = keyboard.nextInt();
			
			System.out.print("Enter the second integer : ");
			int num2 = keyboard.nextInt();
			
			System.out.print("Enter the third integer: ");
			int num3 = keyboard.nextInt();
			
			System.out.println("User entered numbers are: " +num1+" "+num2+" "+num3);
			
			
			int sNUM = num1;
				if(num2 < sNUM)
					{sNUM = num2;}
				if(num3 < sNUM)
					{sNUM = num3;}
					
			
			int lNUM = num1;
				if (num2 > lNUM)
					{lNUM = num2;}
				if(num3 > lNUM)
					{lNUM = num3;}
					
			System.out.println("The Smallest number is :" +sNUM);
			System.out.println("The Largest number is :" +lNUM);
		}
	}
			