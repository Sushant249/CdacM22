import java.util.*;
class Que9
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int i=1;
		for(i=1;i<=(no/2);i++)
		{
			if (no%i==0)
				System.out.println(i);
		}
	}
}