import java.util.*;
class Ifelse
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		if(marks>=90 && marks<100)
		{
			System.out.println("you have got A+ Garde");
		}else if(marks>=80 && marks<90)
		{
			System.out.println("You have got A grade");
		}else if(marks>=70 && marks<80)
		{
			System.out.println("You have got B grade");
		}else if (marks>=60 && marks<70)
		{
			System.out.println("You have got C grade");
		}else if(marks>=50 && marks<60)
		{
			System.out.println("You have got D grade ");
		}else
		{
			System.out.println("You are Fail...");
		}			
	}
}