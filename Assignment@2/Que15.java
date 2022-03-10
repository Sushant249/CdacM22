import java.util.*;
class Que15
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two numbers...");
		int a= sc.nextInt();//a=4
		int b= sc.nextInt();//b=5
		System.out.println("numbers after swapping");
		a= a+b;//a=9
		b= a-b;//b=9-5=4
		a= a-b;//a=9-4=5
		System.out.println("a= "+a+"b ="+b);
	}
}