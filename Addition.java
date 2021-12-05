import java.util.Scanner;

public class Addition
{
	public static void main(String args[])
	{
		int a,b,c=0;
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the vlue of A :");
		a=sc.nextInt();
		System.out.println("Enter the vlue of B :");
		b=sc.nextInt();
	
		c=a+b; //Operation

		System.out.println("Addtion : "+c);
	}
}