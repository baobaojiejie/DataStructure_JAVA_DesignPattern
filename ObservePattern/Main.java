package ObservePattern;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		SongWriter subject = new SongWriter();
	    Observer sub1 = new Singer("Wang");
	    Observer sub2 = new MusicPublisher("The Global");
	    
	    sub1.subscribeSubject(subject);
	    sub2.subscribeSubject(subject);
	    
	    subject.createSong("Legend", "Pop");
	    
	    subject.displayObserver();
	    
	    sub1.unSubscribeSubject(subject);
	    
	    System.out.println("After unsubscribe:");
	    subject.displayObserver();
	   
	}
	
}
