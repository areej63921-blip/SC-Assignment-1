

import java.util.Arrays;
import java.util.List;

// Make sure this class is in the same package as Company, Employee, etc.
public class OutsourcingCompany extends Company {

    @Override
    public List<Employee> getEmployees() {
        // returns a list of Programmer and Tester objects
        return Arrays.asList(new Programmer(), new Tester());
    }
}
