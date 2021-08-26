package singletonPattern;

public class Main {

	public static void main(String[] args) {
		
		Singleton obj1 = Singleton.getInstance("Wang");
        Singleton obj2 = Singleton.getInstance("John");
        
        System.out.println(obj1);
        System.out.println(obj2);
	}

}
