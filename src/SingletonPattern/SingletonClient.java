package SingletonPattern;

public class SingletonClient {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		System.out.println(singleton1);
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton2);
	}
}
