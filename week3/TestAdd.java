public class TestAdd
{
	public static int getSum(int[] a)
	{
		int sum = 0;
		
	
		for(int i = 0; i < a.length; i++)
		{
			sum = sum + a[i];
		}
		return sum;
	}
	public static void main(String[] args)
	{
		int[] num = {2,3,4,5,6};
		System.out.print(TestAdd.getSum(num));
	}
}
