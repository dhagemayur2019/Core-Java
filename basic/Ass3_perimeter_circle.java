package homework;
//3. Write a program to print the area and perimeter of a circle

public class Ass3_perimeter_circle
{
		public static void main(String args[])
		{
			final float pi = 3.14f,r=5,dia,per,area;
			area = pi*r*r;
			dia=2*r;
			per = pi*2*r;
			System.out.println("area="+area);
			System.out.println("diameter="+dia);
			System.out.println("perimeter="+per);
		}
}

