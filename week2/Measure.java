public class Measure
{
	public static double inches2cm (double num)
	{
		return num* 2.54;
	}

	public static void main(String[] args)
	{
		System.out.println(Measure.inches2cm(7));
	}
}