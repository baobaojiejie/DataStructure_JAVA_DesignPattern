package singletonPattern;

public class Singleton {

	private static Singleton instance;
	
	private String name;
	
	private Singleton(String nm) 
	{
		name = nm;
		System.out.println("Hello " + name);
	}
	
	public static Singleton getInstance(String nm ) 
	{
		if(instance==null) 
		{
			instance = new Singleton(nm);
		}
		return instance;
	}
}
