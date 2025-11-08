import java.util.List;

	public abstract class Company {

	    // Factory Method — subclasses will provide employees
	    public abstract List<Employee> getEmployees();

	    // This method uses employees without knowing their exact types
	    public void createSoftware() {
	        List<Employee> employees = getEmployees();
	        for (Employee e : employees) {
	            e.doWork();
	        }
	        System.out.println("Software creation process completed!\n");
	    }
	}

