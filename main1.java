import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner std=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=std.nextInt();
		
		if(a>0)
		{
			System.out.println("Number is Positive");
		}
		else if(a<0)
		{
			System.out.println("Number is negative");
		}
		else
		{
			System.out.println("zero");
		}
	}
}
