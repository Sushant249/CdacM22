import java.util.*;
class Que11
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius ");
		double rad = sc.nextFloat();
		final float pi = 3.14f;
		double peri=2*pi*rad;
		double area=pi*rad*rad;
		System.out.println("Perimeter is = " +peri);
		System.out.println("Area is = " +area);
	}
}