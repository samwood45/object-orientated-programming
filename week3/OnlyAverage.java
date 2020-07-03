import java.util.Scanner;

public class OnlyAverage
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        double sum = 0.0;
        System.out.print("Enter " + num + " numbers: ");
        for(int i = 0; i < num; i++)
        {
            double n = in.nextDouble();
            sum = sum + n;
        }
        
            
        System.out.println("The average is " + sum / num);
    }
}