package ObservePattern;

public interface Observer {

	void update();
	void subscribeSubject(Subject s);
	void unSubscribeSubject(Subject s);
	String getName();
}
