package selfLearning;
import java.util.Scanner;



public class HypotenuseTriangle {
	public static void main(String[] arg) {
		
		double a,b,c;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the side of a : ");
		a=input.nextDouble();
		
		System.out.println("Enter the side of b : ");
		b=input.nextDouble();
		
		// c=square root of (a2+b2)
		
		c=Math.sqrt((a*a)+(b*b));
		
		System.out.println("Area of the Triangle is "+c);
		
		input.close();
	}
	

}
