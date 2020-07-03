public class Measure
{
	public static double inches2CMS(double a)
	{
		return a*2.54;
	}

	public static void main(String [] args)
	{
		System.out.print(inches2CMS(3));
	}
}