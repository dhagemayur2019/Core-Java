package homework;
//4. Write a program to print the area and perimeter of a rectangle

public class Ass4_perimtr_rect
{
		public static void main(String args[])
		{
			int len = 5 , bred = 3,area,peri;
			area = len*bred;
			peri = 2*(len+bred);
			System.out.println("area of rect="+area);
			System.out.println("perimeter of rect="+peri);
		}
}

