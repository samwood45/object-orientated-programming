public class Testfives
{
	public static int getFives(int[] a)
	{
		int sum = 0;
		for(int i = 0; i < a.length; i++)
		{
			if(a[i]== 5)
				sum = sum + 1;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		int [] num = {5,5,5,6,7, 5};
		System.out.print(Testfives.getFives(num));
	}


}