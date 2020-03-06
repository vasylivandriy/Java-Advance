import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CarDaoRead {

    private Connection connection;
    private static final String select_ALL_from_car_table = "select * from car.car_table";
    private static final String select_ID1_from_car_table = "select * from car.car_table where id = 1";


    public CarDaoRead() throws SQLException {

        this.connection = ConnectionManager.getConnection();
    }

    public List<Car> getALL() throws SQLException {

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(select_ALL_from_car_table);

        List<Car> carList = new ArrayList<>();

        while (resultSet.next()) {

            carList.add(Car.result(resultSet));
        }

        return carList;

    }



}
