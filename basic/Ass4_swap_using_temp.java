package classwork;

//4. Write a program to swap two variables
public class Ass4_swap_using_temp
{
	public static void main(String args[])
	{
		int a = 10, b=5,temp;
		System.out.println("before swapping");
		System.out.println("A="+a);
		System.out.println("B="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping");
		System.out.println("A="+a);
		System.out.println("B="+b);
	}
}
