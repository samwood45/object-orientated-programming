import java.util.Scanner;
public class HowManyNumbers
{
	public static void main(String [] args)
	{
	Scanner in = new Scanner(System.in);
	
		int n = 0;
		int count = -1;
		System.out.print("Enter numbers: ");
		while( n != -1)
		{	
			
			n = in.nextInt();
			count = count + 1;
			
		}

		System.out.print(count + " numbers were enetered.");
	}

}
