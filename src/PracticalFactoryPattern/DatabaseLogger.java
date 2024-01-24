package PracticalFactoryPattern;

public class DatabaseLogger implements ILogger {

	@Override
	public void log(String message) {
		System.out.println("logging in DB "+message);
	}

}
