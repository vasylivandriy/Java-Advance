import java.sql.ResultSet;
import java.sql.SQLException;

public class Car {

    private int id;
    private String model;
    private String color;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public static Car result(ResultSet resultSet ) throws SQLException {

        Car car = new Car();

        car.setId(resultSet.getInt("id"));
        car.setModel(resultSet.getString("model"));
        car.setColor(resultSet.getString("color"));

        return null;
    }


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

