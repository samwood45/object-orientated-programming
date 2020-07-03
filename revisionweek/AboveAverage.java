import java.util.Scanner;

public class AboveAverage
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        
        // Create an array
        double [] numbers = new double[num];
        double average = 0.0;

        System.out.print("Enter " + num + " numbers: ");

        // Now read in the numbers
        for(int i = 0; i < num; i++){
        	int j = in.nextInt();
        	numbers[i] = j;
        }
        
        for(int k = 0; k < num; k++){
        	average += numbers[k];
        }
        average = average/num;
        ///System.out.print(average);

        // Print out the numbers greater than the average
       System.out.println("The above average numbers are:");
	   for(int i = 0; i < num; i++){
           if (numbers[i] > average)
	           	  System.out.print(numbers[i]);
	           }
        		

        // You can use the following code to print out one number
        //System.out.print(" " + numbers[i]);

    //    System.out.println(); // Should finish with a new line
    }
}