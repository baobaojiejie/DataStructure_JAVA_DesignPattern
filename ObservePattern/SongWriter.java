package ObservePattern;

import java.util.ArrayList;
import java.util.List;

public class SongWriter implements Subject{
	
	private String songTitle;
	private String songType;
	
	List<Observer> subs;
	
	public SongWriter() 
	{
		subs = new ArrayList<>();
	}

	@Override
	public void subscribe(Observer o) {
		
		if(!subs.contains(o)) 
		{
		subs.add(o);
		}
		
	}

	@Override
	public void unSubscribe(Observer o) {
		
		if(subs.contains(o)) 
		{
		subs.remove(o);
		}
		
	}

	@Override
	public void notifyObserver() {
		
		subs.forEach(o ->o.update());
		
	}
	
	public void createSong(String title,String type) 
	{
		songTitle = title;
		songType = type;
		notifyObserver();
	}

	@Override
	public String toString() {
		return "SongWriter [songTitle=" + songTitle + ", songType=" + songType + "]";
	}

    void displayObserver() 
    {
    	for(Observer o: subs) 
    	{
    		System.out.println(o.getName());
    	}
    }

	

}
