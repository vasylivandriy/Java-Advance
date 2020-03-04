import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CarDao {

    private Connection connection;
    private static final String select_ALL_from_car_table = "select * from car.car_table";

    public CarDao() {
        this.connection = ConnectionManager.getConnection();
    }


    public List<Car> getCarALL() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(select_ALL_from_car_table);

        List<Car> carList = new ArrayList<Car>();

        while (resultSet.next()) {

            carList.add(Car.result(resultSet));
        }


        return carList;
    }


}
