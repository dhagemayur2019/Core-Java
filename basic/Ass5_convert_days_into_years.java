package classwork;
// 5.Write a program to convert days into years, weeks and days.{Hint: Input-373 days Output-1Year,1Weak,1day}

public class Ass5_convert_days_into_years
{
	public static void main(String args[])
	{
		int day = 373,year,rem,week,rday;
		year = day/365;
		rem = day%365;
		week = rem/7;
		rem = rem%7;
		rday = rem/1;
		System.out.println("year="+year);
		System.out.println("weeks="+week);
		System.out.println("days="+rday); 
		
	}
}

