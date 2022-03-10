import java.util.*;
class Que5
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Input first number ");
	int num1 = sc.nextInt();
	System.out.println("Input Second number");
	int num2 = sc.nextInt();
	int product = num1*num2;
	// String name = sc.nextLine();
	// name=sc.nextLine();
	// System.out.println(name);
	// just for checking space is consider when wo go from int to string
	System.out.println("Product of  "+num1+" and "+num2+" is = "+product);
	}
}