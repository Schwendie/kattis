import java.util.Scanner;

public class yoda
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		String num1 = console.next();
		String num2 = console.next();
		
		console.close();
		
		String num1_new = "";
		String num2_new = "";
		
		// Make the numbers the same amount of digits.		
		while (num1.length() != num2.length())
		{
			if (num1.length() > num2.length())
				num2 = "0" + num2;
			else
				num1 = "0" + num1;
		}		
		
		// Collide the numbers
		for (int i = 0; i < num1.length(); i++)
		{
			int x = Integer.parseInt(num1.substring(i, i + 1));
			int y = Integer.parseInt(num2.substring(i, i + 1));
			
			if (x > y)
				num1_new = num1_new + Integer.toString(x);
			else if (x < y)
				num2_new = num2_new + Integer.toString(y);
			else
			{
				num1_new = num1_new + Integer.toString(x);
				num2_new = num2_new + Integer.toString(y);
			}
		}
		
		// Print the results
		if (num1_new.equals(""))
			System.out.println("YODA");
		else
			System.out.println(Integer.parseInt(num1_new));
		
		if (num2_new.equals(""))
			System.out.println("YODA");
		else
			System.out.println(Integer.parseInt(num2_new));
	}
}