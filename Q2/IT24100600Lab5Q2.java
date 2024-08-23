import java.util.Scanner;
	public class IT24100600Lab5Q2
	{
		public static void main(String []args)
		{
			Scanner keyboard = new Scanner(System.in);
			
			System.out.print("Enter the number of new members : ");
			int newMEMBER = keyboard.nextInt();
			
				/*if (newMEMBER==0)
					{System.out.print("No Prize");}
				
				else if (newMEMBER==1)
					{System.out.print("prize is a : Pen");}
				
				else if (newMEMBER==2)
					{System.out.print("prize is a : Umbrella");}
				
				else if (newMEMBER==3)
					{System.out.print("prize is a : Bag");}
				
				else if (newMEMBER==4)
					{System.out.print("prize is a : Travelling Chair");}
				
				else if (newMEMBER>=5)
					{System.out.print("prize is a : Headphone");}
				
				else if (newMEMBER<0)
					{System.out.print("Input must be a number 0 or grater");}*/
				if (newMEMBER < 0)
				{System.out.print("Input must be a number 0 or grater");}
			switch (newMEMBER)
				{
					case 0:
					System.out.print("No Prize");
						break;
					case 1:
					System.out.print("Prize is a: pen");
						break;
					case 2:
					System.out.print("Prize is a: Umbrella");
						break;
					case 3:
					System.out.print("Prize is a: Bag");
						break;
					case 4:
					System.out.print("Prize is a: Travelling Bag");
						break;
					case 5:
					System.out.print("Prize is a: Headphone");
						break;
					default:
					System.out.print("Prize is a: Headphone");
				}
		}
	}