package ObservePattern;

public interface Subject {

	void subscribe(Observer o);
	void unSubscribe(Observer o);
	void notifyObserver();
}
