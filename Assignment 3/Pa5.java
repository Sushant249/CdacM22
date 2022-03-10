class Pa5
{
	public  static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=5-i;l<4;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*
      *
	 ***
	*****
   *******
  *********
  
 */




