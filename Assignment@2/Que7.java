import java.util.*;
class Que7
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			int j=num*i;
			System.out.println(num+"*"+i+"="+j);
		}
		
	}
}