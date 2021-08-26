package ObservePattern;

public class Singer implements Observer {
	
	private String name;
	private Subject subject;

	

	public Singer(String nm) 
	{
		name = nm;
	}
	
	@Override
	public void update() {
		
		System.out.println("New update of subject: "+subject.toString());
	}
	
	@Override
	public void subscribeSubject(Subject s)
	{
		subject = s;
		s.subscribe(this);
	}
	
	@Override
	public String getName() 
	{
		return name;
	}

    @Override
	public void unSubscribeSubject(Subject s) {
		subject = null;
		s.unSubscribe(this);
	}

}
