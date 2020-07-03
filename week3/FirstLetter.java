import java.util.Scanner;

public class FirstLetter
{
	public static boolean letter(String a, char b)
	{
		char c;
		c = a.charAt(0);
		if (b == c)
			return true;
		else
			return false;

	}

	public static void main(String[] args)
	{
		
		System.out.print(FirstLetter.letter("num", 'n'));
	}

}