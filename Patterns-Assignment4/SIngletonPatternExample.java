package Patterns;

public class SIngletonPatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LazyInstantiation lazyInstantiation1 = LazyInstantiation.getInstance();
		LazyInstantiation lazyInstantiation2 = LazyInstantiation.getInstance();
		System.out.println(lazyInstantiation1 + " " + lazyInstantiation2 + "\n");
		
		EarlyInstantiation earlyInstantiation1 = EarlyInstantiation.getInstance();
		EarlyInstantiation earlyInstantiation2 = EarlyInstantiation.getInstance();
		System.out.println(earlyInstantiation1 + " " + earlyInstantiation2 );
	}
}

class LazyInstantiation {
	private static LazyInstantiation lazyInstantiation;

	private LazyInstantiation() 
	{
		System.out.println("Object Created of class LazyInstantiation");
	}

	public static LazyInstantiation getInstance() 
	{
		if (lazyInstantiation == null) 
		{
			lazyInstantiation = new LazyInstantiation();
		}
		return lazyInstantiation;
	}
}

class EarlyInstantiation{
	private static EarlyInstantiation earlyInstantiation=new EarlyInstantiation();

	private EarlyInstantiation() 
	{
		System.out.println("Object Created of class EarlyInstantiation");
	}

	public static EarlyInstantiation getInstance() 
	{
		return earlyInstantiation;
	}
}