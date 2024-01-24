package Adapter_Pattern;

public class DBConnectorFactory {
	DatabaseConnector getDBConnector(String type) throws Exception {
		if("Sql".equalsIgnoreCase(type))
			return new SQLConnector();
		else if("Oracle".equalsIgnoreCase(type))
			return new OracleDBConnector();
		else
			throw new Exception("Incorrect argument");
	}
}
