package IteratorPattern;

public class CityCollection implements IP_Collection{
	
	String[] cities = {"Montreal","Ottawa","Halifax","Vancouver"};

	@Override
	public IP_Iterator getIterator() {
		
		return new CityIterator();
	}
	
	
	/** Create an inner class that implements the Iterator interface**/
	
	private class CityIterator implements IP_Iterator
	{
		int index = 0;

		@Override
		public boolean hasNext() {
			if(index < cities.length) 
			{
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext())
			{
				return cities[index++];
			}
			return null;
		}
		
	}

}
