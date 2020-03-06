import java.sql.*;
import java.util.List;

public class CarDaoInsert {

    private Connection connection;
    private String Insert_INTO_DB = "INSERT into car_table(model,color) values (?,?)";

    public CarDaoInsert() throws SQLException {
        this.connection = ConnectionManager.getConnection();
    }

    public int insertValue(String model, String color) throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement(Insert_INTO_DB, Statement.RETURN_GENERATED_KEYS);

        preparedStatement.setObject(1, model);
        preparedStatement.setObject(2, color);

        preparedStatement.executeUpdate();
        ResultSet generatedKeys = preparedStatement.getGeneratedKeys();

        generatedKeys.next();

        return generatedKeys.getInt(1);
    }


}
