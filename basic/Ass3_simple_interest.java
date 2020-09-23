package classwork;

//3. Write a program to calculate Simple Interest


public class Ass3_simple_interest
{
	public static void main(String args[])
	{
	double principal = 3000, rate= 3 , time = 3, si,famt;
		
		si = (principal*rate*time)/100;
		//temp = rate/100;
		famt = principal*(1+(rate/100)*time);
		System.out.println("si="+si);
		System.out.println("final amount = "+famt);
	}
}
