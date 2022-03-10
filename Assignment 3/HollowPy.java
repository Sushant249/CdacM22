class HollowPy
{
	public static void main(String args[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=6;j>=i;j--)
			{
				// if(i==2&&j==2 || i==2&&j==3 || i==2 &&j==4 || i==3&&j==2 || i==3&&j==3 || i==4&&j==2)
					if(i+j==4 || i+j== 5 || i+j== 6)
						{System.out.print(" ");}
				
				     System.out.print("* ");
			}
			System.out.println();
		}
	}
}