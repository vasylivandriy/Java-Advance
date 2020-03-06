import java.sql.SQLException;
import java.util.List;

public class MAIN {

    public static void main(String[] args) throws SQLException {


//        CarDaoInsert carDaoInsert = new CarDaoInsert();
//        carDaoInsert.insertValue("Jaguar", "Red");


        CarDaoDelete carDaoDelete = new CarDaoDelete();

//        carDaoDelete.deleteCond(1);
//        carDaoDelete.deleteCond("color","red");
//        carDaoDelete.carDeleteAll();

        CarDaoUpdate carDaoUpdate = new CarDaoUpdate();
        carDaoUpdate.update(1,"Bentley", "grey");



        CarDaoRead carDaoRead = new CarDaoRead();
        List<Car> carsRead = carDaoRead.getALL();

        System.out.println("Cars read");
        System.out.println(carsRead);


    }
}
