import java.sql.SQLException;
import java.util.List;

public class MAIN {

    public static void main(String[] args) throws SQLException {


        CarDaoCRUD carDaoCRUD = new CarDaoCRUD();
        carDaoCRUD.insertValue("Jaguar", "Red");


//
//        carDaoCRUD.deleteById(1);
//        carDaoCRUD.carDeleteAll();
//
//
//        carDaoCRUD.update(1,"Bentley", "grey");




        List<Car> carsRead = carDaoCRUD.getALL();

        System.out.println("Cars read");
        System.out.println(carsRead);


    }
}
