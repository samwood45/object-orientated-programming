import java.util.Scanner;

public class AboveAverage
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        double sum = 0.0;
        // Create an array
        
        System.out.print("Enter " + num + " numbers: ");
        double [] numbers = new double[num];
        // Now read in the numbers
        for(int i = 0; i < num; i++)
        {
            double n = in.nextDouble();
            numbers[i] = n;
            sum = sum + n;
        }
        double average = sum/num;
        // Print out the numbers greater than the average
        System.out.println("The above average numbers are:");
        // You can use the following code to print out one number
        for(int i = 0; i <numbers.length; i++)
        {
            if(numbers[i] > average)
                System.out.print(" " + numbers[i]);
        }
        

        System.out.println(); // Should finish with a new line
    }
}