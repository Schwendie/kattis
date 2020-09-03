import java.util.Scanner;
import java.util.Arrays;

public class roboturt
{
	public static void main(String[] args)
	{
		/* 8x8 playing field
		 * 9 input lines
		 * T = turtle
		 * C = castle, I = ice castle
		 * D = diamond
		 * F = forward, R = turn right, L = turn left
		 * X = fire laser
		 */
		char[][] board = new char[8][8];
		
		Scanner console = new Scanner(System.in);
		
		for (int i = 0; i < 8; i++)
		{
			String str = console.nextLine();
			
			for (int j = 0; j < 8; j++)
			{
				board[i][j] = str.charAt(j);
			}
		}
		
		for (char[] row : board)
			System.out.println(Arrays.toString(row));
	}
}