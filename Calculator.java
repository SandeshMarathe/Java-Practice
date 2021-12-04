public class Calculator
{
	public int mulOfThreeNum(int a,int b,int c)
	{
		return a*b*c;
	}
	public static void main(String args[])
	{
		Calculator d = new Calculator();
		System.out.println(d.mulOfThreeNum(10,20,30));
	}
}
