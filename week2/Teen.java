public class Teen
{
	public static boolean Teenager(int n)
	{
		if ((n > 12) && (n < 20))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	public static void main(String[] args)
	{
		System.out.println(Teen.Teenager(18));
	}
}


