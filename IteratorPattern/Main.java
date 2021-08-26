package IteratorPattern;

public class Main {

	public static void main(String[] args) {
		
		IP_Collection collection1 = new CityCollection();
		IP_Iterator pointer = collection1.getIterator();
		
		while(pointer.hasNext()) 
		{
			Object obj = pointer.next();
			String city = (String)obj;
			System.out.println(city);
		}

	}

}
