package PracticalFactoryPattern;

public class ConsoleLogger implements ILogger {

	@Override
	public void log(String message) {
		System.out.println("logging on Console "+message);
	}

}
