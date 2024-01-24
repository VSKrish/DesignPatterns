package Adapter_Pattern;

public class AdapterClient {
	public static void main(String[] args) {
		DBConnectorFactory factory = new DBConnectorFactory();
		DatabaseConnector conn = null;
		try {
			conn = factory.getDBConnector("Sql");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		conn.connectToDatabase();
		conn.executeQuery("");
		conn.disconnect();
	}
}
