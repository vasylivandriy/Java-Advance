import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarDaoCRUD {

    private Connection connection;
    private static final String DELETE_FROM_TABLE_ID = "DELETE FROM car_table where id = ?";
    private static final String Delete_ALL_from_car_table = "DELETE from car_table";
    ////////
    private static final String Insert_INTO_DB = "INSERT into car_table(model,color) values (?,?)";
    //////
    private static final String select_ALL_from_car_table = "select * from car.car_table";
    //////
    private static final String UPDATE_BY_ID = "UPDATE car_table set color =?, model =? where id = ?";


    public CarDaoCRUD() throws SQLException {
        this.connection = ConnectionManager.getConnection();
    }


    public void deleteById(int id) throws SQLException {

        PreparedStatement preparedStatementID = connection.prepareStatement(DELETE_FROM_TABLE_ID);

        preparedStatementID.setInt(1, id);
        preparedStatementID.executeUpdate();

    }

    public void carDeleteAll() throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement(Delete_ALL_from_car_table);

        preparedStatement.executeUpdate();

    }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int insertValue(String model, String color) throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement(Insert_INTO_DB, Statement.RETURN_GENERATED_KEYS);

        preparedStatement.setObject(1, model);
        preparedStatement.setObject(2, color);

        preparedStatement.executeUpdate();
        ResultSet generatedKeys = preparedStatement.getGeneratedKeys();

        generatedKeys.next();

        return generatedKeys.getInt(1);
    }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public List<Car> getALL() throws SQLException {

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(select_ALL_from_car_table);

        List<Car> carList = new ArrayList<>();

        while (resultSet.next()) {

            carList.add(Car.result(resultSet));
        }

        return carList;

    }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void update(int id, String color, String model) throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_BY_ID);

        preparedStatement.setString(1, color);
        preparedStatement.setString(2, model);
        preparedStatement.setInt(3, id);

        preparedStatement.executeUpdate();
    }

}
