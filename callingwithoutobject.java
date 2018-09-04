class A
{
	public static void a() 
	{
		System.out.println("hello java");
	}
	
}
class B extends A{}
public class callingwithoutobject
{
	public static void main(String[] args)
	{
		B.a();
	}
}