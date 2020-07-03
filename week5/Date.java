public class Date
{
    private int day;
    private int month;
    private int year;

    public Date()
    {
    	day = 1;
    	month = 1;
    	year = 2000;
    }

    public Date(String date)
    {
    	String dates [] = date.split(" ");
    	this.day = Integer.valueOf(dates[0]);
    	this.month = Integer.valueOf(dates[1]);
    	this.year =  Integer.valueOf(dates[2]);
    }

    public boolean isOnOrAfter(Date theDate)
    {
    	if (day >= theDate.day && month >= theDate.month && year >= theDate.year)
    	{
    		return true;
    	}
    	return false;
    }


    public Date(int d, int m, int y)
    {
    	day = d;
    	month = m;
    	year = y;
    }
    
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }

    public static void main(String [] args)
    {
    	String input = "21 9 2015";
    	System.out.println(new Date(input));
    }

    public 

  
}