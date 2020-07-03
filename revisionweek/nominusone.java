import java.util.Scanner;
public class nominusone
{
	public static void main(String [] args)
	{
	Scanner in = new Scanner(System.in);
	
		int n = 0;
		int last = 0;
		System.out.print("Enter numbers: ");
		while( n != -1)
		{	
			last = n;
			n = in.nextInt();
			
		}
		System.out.print(last);
	}
}