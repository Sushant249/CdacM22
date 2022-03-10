import java.util.*;
class Pat1
{
	public static void main(String args[])
	{
		for(int i=1; i<=5 ;i++)//row 
		{
			// for(int k=5;k>i;k--)
			// {
				// System.out.print(" ");
			// }
			// for(int j=1;j<=i;j++)//column
			// {
				// System.out.print(+j);
			// }
			
			for(int l=1;l<=i;l++)
			{
				System.out.print(l+" ");
			}
			System.out.println();
		}
	}
}