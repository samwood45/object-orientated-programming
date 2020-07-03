public class CountEven
{
	public static int even(int[] a)
	{
		int sum = 0;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i] % 2 == 0)
				sum = sum + 1;
		}
		return sum;
	}

	public static void main(String[] args)
	{
		int [] num = {5,67,8,6,3,4};
		System.out.print(CountEven.even(num));
	}
}