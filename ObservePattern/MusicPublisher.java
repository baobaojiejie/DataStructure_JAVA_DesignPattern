package ObservePattern;

public class MusicPublisher implements Observer{
	
	private String name;
	private Subject subject;
	
	public MusicPublisher(String nm) 
	{
		name = nm;
	}

	@Override
	public void update() {
		
		System.out.println(name+" received new song.  " + subject.toString());
		
	}

	@Override
	public void subscribeSubject(Subject s) {
		
		subject = s;
		subject.subscribe(this);
	}
	
	@Override
	public String getName() 
	{
		return name;
	}

	@Override
	public void unSubscribeSubject(Subject s) {
		
		subject = s;
		subject.unSubscribe(this);
		
	}

}
