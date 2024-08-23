import java.util.Scanner;
	public class IT24100600Lab5Q3
	{
		public static void main(String []args)
		{
			Scanner keyboard = new Scanner(System.in);
			
			System.out.print("Enter start date (1-31): ");
			int startDATE = keyboard.nextInt();
			
			System.out.print("Enter end date (1-31): ");
			int endDATE = keyboard.nextInt();
			
			if (startDATE>31 || startDATE<1 || endDATE>31 || endDATE<1)
				{System.out.print("Error: Days must be between 1 and 31");}
			
			if (startDATE > endDATE)
				{System.out.print("Error: Start date must be less than END date");}
			
			System.out.println("");
			
			double roomCHARGE = 48000.0;
			System.out.println("Room charge per day: RS." +roomCHARGE+"/=");
			
			double dis3t4 = 0.1;
			double disMORE5 = 0.2;
			
			int numofDAYS = endDATE - startDATE;
			System.out.println("Number of days Reserved: "+numofDAYS);
			
			double totAMOUNT = numofDAYS * roomCHARGE;
			
			if (numofDAYS>1 && numofDAYS<3)
				totAMOUNT = totAMOUNT;
			if (numofDAYS==3 || numofDAYS==4)
				totAMOUNT = totAMOUNT - (totAMOUNT * dis3t4);
			if (numofDAYS>4)
				totAMOUNT = totAMOUNT - (totAMOUNT * disMORE5);
			System.out.print("Total amount to be paid: "+totAMOUNT);
		}
	}
