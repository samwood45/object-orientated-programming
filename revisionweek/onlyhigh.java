/*
    This code is supplied and may be used to solve this problem.
*/
import java.util.Scanner;

public class onlyhigh
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        // Read in the word
        String word = in.next();
        int len = word.length();
        for(int i = 0; i <len-1; i++){
            String a = word.substring(i,i+2);
            if (a.equals("hi"))

                System.out.println(a);
        }
    }
}