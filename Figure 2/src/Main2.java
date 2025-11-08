public class Main2 {
    public static void main(String[] args) {

        Driver human = new Human();
        Driver robot = new Robot();
        // Transport 1 Combustion Engine
        Transport truck = new Transport("combustion", human);
        truck.deliver("Karachi", "Groceries");

        // Transport 2 Electric Engine
        Transport drone = new Transport("electric", robot);
        drone.deliver("Lahore", "Documents");

        // Transport 3 Same driver, different engine
        Transport taxi = new Transport("electric", human);
        taxi.deliver("Islamabad", "Passengers");
    }
}