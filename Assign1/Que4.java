import java.util.*;
class Que4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number ");
		int x = sc.nextInt();
		System.out.println("Enter Second number");
		int y = sc.nextInt();
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("Swaped nos are x= "+x+ "y= "+y);
	}
}