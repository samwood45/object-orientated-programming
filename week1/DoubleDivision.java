import java.util.Scanner;

public class DoubleDivision
{
    
    public static void main(String [] args)
    {
    	Scanner in = new Scanner(System.in);

    	System.out.print("Please enter two floating point numbers: ");
    	double x = in.nextDouble();
    	double y = in.nextDouble();
    	double z = (double)x /(double)y;
    	System.out.print(x +" / " + y + " is " + z);

    }
}