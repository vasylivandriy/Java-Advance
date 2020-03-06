import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarDaoDelete {

    private Connection connection;
    private String DELETE_FROM_TABLE_ID = "DELETE FROM car_table where id = ?";
    private String DELETE_FROM_TABLE_COLOR = "DELETE FROM car_table where id<>0 and color = ?";
    private String DELETE_FROM_TABLE_Model = "DELETE FROM car_table where id<>0 and model = ?";
    private static String select_ID1_from_car_table = "select * from car.car_table";


    public CarDaoDelete() throws SQLException {
        this.connection = ConnectionManager.getConnection();
    }


    public void deleteCond(int id) throws SQLException {

        PreparedStatement preparedStatementID = connection.prepareStatement(DELETE_FROM_TABLE_ID);
        PreparedStatement preparedStatementColor = connection.prepareStatement(DELETE_FROM_TABLE_COLOR);
        PreparedStatement preparedStatementModel = connection.prepareStatement(DELETE_FROM_TABLE_Model);

        preparedStatementID.setInt(1, id);
        preparedStatementID.executeUpdate();


    }


}
