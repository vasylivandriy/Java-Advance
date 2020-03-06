import java.sql.SQLException;
import java.util.List;

public class MAIN {

    public static void main(String[] args) throws SQLException {

        CarDaoRead carDaoRead = new CarDaoRead();
        List<Car> carsRead = carDaoRead.getALL();

        System.out.println("Cars read");
        System.out.println(carsRead);

        CarDaoInsert carDaoInsert = new CarDaoInsert();
        carDaoInsert.insertValue("Jaguar", "Red");


    }
}
