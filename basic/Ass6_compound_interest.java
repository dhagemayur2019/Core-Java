package classwork;







public class Ass6_compound_interest
{ 
	public static void main(String args[]) 
	{ 
		double p = 20000, r= 5.25, t = 5; 
		double final_interest = p*(Math.pow((1+r/100),t)); 
		
		System.out.println("Compound Interest is "+ final_interest); 
	} 
} 
