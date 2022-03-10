/*Write a Java program that takes three numbers as input to calculate and print the 
average of the numbers.*/
import java.util.*;
class Que12
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n1 n2 n3");
		float n1 = sc.nextInt();
		float n2 = sc.nextInt();
		float n3 = sc.nextInt();
		float avg = (n1+n2+n3)/3;
		System.out.println("Average is " +avg);
	}
}