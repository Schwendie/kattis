import java.util.Scanner;
import java.util.ArrayList;

public class fox
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		int t = console.nextInt();
		console.nextLine();
		
		for (int i = 0; i < t; i++)
		{
			String[] rec = console.nextLine().split(" ");
			ArrayList<String> animals = new ArrayList<>();
			
			while (true)
			{
				String str = console.nextLine();
				if (str.equals("what does the fox say?"))
					break;
				
				animals.add(str.split(" ")[2]);
			}
			
			for (int j = 0; j < rec.length; j++)
			{
				if (!animals.contains(rec[j]))
					System.out.print(rec[j] + " ");
			}
		}
		console.close();
	}
}