package PracticalFactoryPattern;

public class LoggerFactory {
	public static ILogger getLoggerObject(String type) throws Exception{
		if("file".equalsIgnoreCase(type))
			return new FileLogger();
		else if("db".equalsIgnoreCase(type) || "database".equalsIgnoreCase(type))
			return new DatabaseLogger();
		else if("console".equalsIgnoreCase(type))
			return new ConsoleLogger();
		else
			throw new Exception("invalid argument");
	}
}
