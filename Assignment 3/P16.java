class P16
{
	public static void main(String args[])
	{
		for(char a=69;a>=65;a--)
		{
			for(int j=65;j<=a;j++)
			{
				System.out.print(" ");
			}
			for(char b=a;b<=69;b++)
			{
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}
}
/*
     E
	D E
   C D E	
  B C D E 
 A B C D E 
 */