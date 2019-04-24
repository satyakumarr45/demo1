class C
{
	int i=100;
	void funb(int j)
	{
		System.out.println("this is funb");
		System.out.println(j);
	}
	
	void func()
	{
		System.out.println("this is func");
	}
}
	

class B extends C
{
	void funb(int j)
	{
		System.out.println("this is satya");
		System.out.println(j);
		super.funb(11);
	}
	void funx()
	{
		System.out.println("hello");
	}
	public static void main(String[] args)
	{
		C c=new B();
     
		c.funb(20);
		c.func();
		//c.funx();
		
		//b.func();
			
	
}
}
	
