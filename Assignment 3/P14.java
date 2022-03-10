class P14
{
	public static void main(String args[])
	{
		for(char a=65;a<=69;a++)
		{
			for (int i=69;i>=a;i--)
			{
				System.out.print(" ");
			}
			for(char b=65;b<=a;b++)
			{
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}
		
}
/*
      A
	 A B 
	A B C 
   A B C D	
  A B C D E	 
 */
 
 
 //If we replace line no 13 "b" by "a" it gives row vales.