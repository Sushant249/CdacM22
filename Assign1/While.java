import java.util.*;
class While
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int num = sc.nextInt();
		int table;
		int i=1;
		while(i<=10)
		{
			table=num*i;
			System.out.println(+table);
			i++;
		}
	}
}