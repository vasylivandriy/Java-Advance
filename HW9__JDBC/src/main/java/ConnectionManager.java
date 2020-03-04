import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    // private static final String JDBC_URL = "jdbc:mysql://localhost:3306/car?useUnicode=true&serverTimezone=UTC";
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/car?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1111";


    public static Connection getConnection() {

        try {
            DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Can't connect to database");
        }

        return null;
    }


}
