package PracticalFactoryPattern;

public class FileLogger implements ILogger {

	@Override
	public void log(String message) {
		System.out.println("logging in file "+message);
	}

}
