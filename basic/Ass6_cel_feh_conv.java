package homework;
// 6 Write a program to convert Celsius into Fahrenheit and vicevers
public class Ass6_cel_feh_conv
{
		public static void main(String args[])
		{
			int cel = 15,feh = 5;
			double fcel,ffeh;
			fcel = (feh-32)/1.8;
			ffeh= (cel*1.8)+32;
			System.out.println("cel="+fcel);
			System.out.println("feh="+ffeh);			
		}
}


