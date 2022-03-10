import java.util.*;
class Que1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		String num = (no%2==0) ? "Even" : "Odd" ;
		System.out.println("The no is " +num);
	    
	}
}