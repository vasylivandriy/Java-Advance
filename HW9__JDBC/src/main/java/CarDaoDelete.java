import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarDaoDelete {

    private Connection connection;
    private String DELETE_FROM_TABLE_ID = "DELETE FROM car_table where id = ?";
    private String DELETE_FROM_TABLE_COLOR = "DELETE FROM car_table where id<>0 and color = ?";
    private String DELETE_FROM_TABLE_Model = "DELETE FROM car_table where id<>0 and model = ?";
    private static String Delete_ALL_from_car_table = "DELETE from car_table";


    public CarDaoDelete() throws SQLException {
        this.connection = ConnectionManager.getConnection();
    }


    public void deleteCond(int id) throws SQLException {

        PreparedStatement preparedStatementID = connection.prepareStatement(DELETE_FROM_TABLE_ID);

        preparedStatementID.setInt(1, id);
        preparedStatementID.executeUpdate();

    }


    public void deleteCond(String colorModel, String name) throws SQLException {

        switch (colorModel.toLowerCase()) {

            case "color": {
                PreparedStatement preparedStatementColor = connection.prepareStatement(DELETE_FROM_TABLE_COLOR);

                preparedStatementColor.setString(1, name);
                preparedStatementColor.executeUpdate();
                break;
            }
            case "model": {
                PreparedStatement preparedStatementModel = connection.prepareStatement(DELETE_FROM_TABLE_Model);

                preparedStatementModel.setString(1, name);
                preparedStatementModel.executeUpdate();
                break;
            }
        }

    }

    public void carDeleteAll() throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement(Delete_ALL_from_car_table);

        preparedStatement.executeUpdate();

    }


}
