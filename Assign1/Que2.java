import java.util.*;
class Que2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int i;
		int fact=1;
		for (i = no ; i>=1 ; i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is "+fact);
	}
}