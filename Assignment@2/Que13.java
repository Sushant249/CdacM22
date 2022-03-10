import java.util.*;
class Que13
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the width");
		float width = sc.nextFloat();
		System.out.println("Enter the Height");
		float height = sc.nextFloat();
		float area = width*height;
		float peri = 2*(width+height);
		System.out.println("Area is "+area);
		System.out.println("Perimeter is "+peri);
	}
}