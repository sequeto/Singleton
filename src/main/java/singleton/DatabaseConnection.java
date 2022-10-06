package singleton;

public class DatabaseConnection {
	private DatabaseConnection() {};
	
    private static DatabaseConnection connection = new DatabaseConnection();
    private String user;
    
    public static DatabaseConnection getConnection() {
        return connection;
    }
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    
}
