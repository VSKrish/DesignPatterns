package Adapter_Pattern;

public interface DatabaseConnector {
	DatabaseConnector connectToDatabase();
    void executeQuery(String query);
    void disconnect();
}
