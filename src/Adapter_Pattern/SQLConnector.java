package Adapter_Pattern;

public class SQLConnector implements DatabaseConnector {

	@Override
	public DatabaseConnector connectToDatabase() {
		System.out.println("logic to connect to SQL DB");
		SQLConnector sqlConn = new SQLConnector();
		System.out.println("Connected to SQL DB");
		return sqlConn;
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
