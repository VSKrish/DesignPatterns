package SingletonPattern;

public class Singleton {
	public static volatile Singleton instance = null;
	private Singleton() {
		
	}
	static Singleton getInstance() {
		if(instance ==null) {
			synchronized(Singleton.class) {
				if(instance==null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
