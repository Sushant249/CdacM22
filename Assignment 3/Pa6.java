class Pa6
{
	public static void main(String args[])
	{
		for(int a=5;a>=1;a--)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print(" ");
			}
			for(int c=4;c>=a;c--)
			{
				System.out.print("*");
			}
			for(int d=4-a;d>=1;d--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=5-i;j<4;j++)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print("*");
			}
			for(int j=4;j>=i;j--)
			{
			    System.out.print("*");
			}
            System.out.println();			
		}
	}
}

/*
*********
 *******
  *****
   ***
    *
 
*/
//Dimond Shape get by first for loop.