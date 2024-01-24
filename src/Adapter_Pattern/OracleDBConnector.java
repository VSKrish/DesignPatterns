package Adapter_Pattern;

public class OracleDBConnector implements DatabaseConnector {
	@Override
	public DatabaseConnector connectToDatabase() {
		System.out.println("logic to connect to Oracle DB");
		OracleDBConnector oracleConn = new OracleDBConnector();
		System.out.println("Connected to Oracle DB");
		return oracleConn;
	}

	@Override
	public void executeQuery(String query) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}

}
