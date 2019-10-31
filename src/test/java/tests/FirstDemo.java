package tests;





import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstDemo {

	@Test(groups= {"smoke"})
	public void sum()
	{
		System.out.println("SUM");
		int a=10;
		int b=20;
		System.out.println("FirstDemo");
		Assert.assertEquals(40, a+b);
		
	}
	
	@Test(groups= {"smoke","sanity"})
	public void sub()
	{
		System.out.println("SUB");
		int a=20;
		int b=10;
		Assert.assertEquals(10, a-b);
	}
	
	@Test(groups= {"smoke","sanity"})
	public void div()
	{
		System.out.println("DIV");
		int a=20;
		int b=10;
		Assert.assertEquals(2, a/b);
	}
	
	@Test(groups= {"smoke","sanity"})
	public void mul()
	{
		System.out.println("MUL");
		int a=20;
		int b=10;
		Assert.assertEquals(200, a*b);
	}
}
