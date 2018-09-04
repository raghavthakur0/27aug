class test
{
	test()
	{
		System.out.println("default constructor");
	}
	test(int x)
	{
		this();
	}
}
public class parameterised
{
	public static void main(String[] args)
	{
		test obj=new test(15);
	}
}