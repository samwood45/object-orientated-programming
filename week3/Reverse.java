import java.util.Scanner;

public class Reverse
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Read in the numbers
        System.out.print("How many numbers: ");
        int n = in.nextInt();
        System.out.print ( "Enter " + n + " numbers: ");
        int [] digits = new int[n];
        for(int i = 0; i < n; i++)
        {
        	int d = in.nextInt();
        	digits[i] = d;
        }
        
        // reverse the numbers
        System.out.print("The numbers reveresed are:");
        for(int i = digits.length-1 ; i>= 0; i--)
        {
        	System.out.print(" " + digits[i]);
        }
        System.out.println();
        
        // print them out
        
        // Use System.out.print(" " + num[i]); and finish with a newline.
    }
}