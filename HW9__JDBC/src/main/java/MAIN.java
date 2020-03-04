import java.sql.SQLException;
import java.util.List;

public class MAIN {

    public static void main(String[] args) throws SQLException {

        CarDao carDao = new CarDao();

        List<Car> cars = carDao.getCarALL();

        System.out.println(cars);

    }
}
