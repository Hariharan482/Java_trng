package Day6;

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
	private static LazyInstantiation lazyinstantiation;

	private LazyInstantiation() 
	{
		System.out.println("Object Created of class LazyInstantiation");
	}

	public static LazyInstantiation getInstance() 
	{
		if (lazyinstantiation == null) 
		{
			lazyinstantiation = new LazyInstantiation();
		}
		return lazyinstantiation;
	}
}

class EarlyInstantiation{
	private static EarlyInstantiation earlyinstantiation=new EarlyInstantiation();

	private EarlyInstantiation() 
	{
		System.out.println("Object Created of class EarlyInstantiation");
	}

	public static EarlyInstantiation getInstance() 
	{
		return earlyinstantiation;
	}
}