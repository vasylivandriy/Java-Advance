import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class SalaryManager {


    private static final Logger LOG = Logger.getLogger(SalaryManager.class);

    void salary(int hours, int salaryPerHour, String name) {

        BasicConfigurator.configure();
        DOMConfigurator.configure("HW8_Log4j/log4j.xml");

        String message = String.format("Will create salary for %s, with parameters: hours = %d and salary per hour = %d", name, hours, salaryPerHour);
        LOG.info(message);

        String messageError = String.format("Salary Won't to create for %s, with parameters: hours = %d and salary per hour = %d", name, hours, salaryPerHour);
        String messageOK = String.format("OK. Salary has created for %s, with parameters: hours = %d and salary per hour = %d", name, hours, salaryPerHour);

        if (hours < 0 || salaryPerHour <= 0)
            LOG.error(messageError, new RuntimeException());

        else {
            int salary = salaryPerHour * hours;
            String messageOK1 = String.format("OK. Salary salary = %d", salary);
            LOG.info(messageOK);
            LOG.info(messageOK1);
        }
    }

}
