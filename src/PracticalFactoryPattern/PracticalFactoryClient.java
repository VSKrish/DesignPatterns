package PracticalFactoryPattern;

import java.util.Scanner;

public class PracticalFactoryClient {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		String type = in.next();
		ILogger loggerObj = LoggerFactory.getLoggerObject(type);
		loggerObj.log("Hi factory");
		in.close();
	}
}
