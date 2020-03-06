import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CarDaoUpdate {

    private Connection connection;
    private final String UPDATE_BY_ID = "UPDATE car_table set color =?, model =? where id = ?";

    public CarDaoUpdate() throws SQLException {
        this.connection = ConnectionManager.getConnection();
    }


    public void update(int id, String color, String model) throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_BY_ID);

        preparedStatement.setString(1, color);
        preparedStatement.setString(2, model);
        preparedStatement.setInt(3, id);

        preparedStatement.executeUpdate();
    }


}
