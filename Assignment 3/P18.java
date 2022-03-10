class P18
{
	public static void main(String args[])
	{
		for(char a=69;a>=65;a--)
		{
			for(char b=65;b<=a;b++)
			{
				System.out.print(b+" ");
			}				
			System.out.println();
		}
	}
}
/*
A B C D E
A B C D 
A B C 
A B 
A
*/