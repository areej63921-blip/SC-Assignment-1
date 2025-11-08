class Transport {

    // Composition 
    private Engine engine;
    // Aggregation 
    private Driver driver;

    public Transport(String engineType, Driver driver) {
        this.driver = driver;

        if (engineType.equalsIgnoreCase("electric")) {
            this.engine = new ElectricEngine();
        } else {
            this.engine = new CombustionEngine();
      }
  }

   public void deliver(String destination, String cargo) {
      System.out.println("Starting delivery of " + cargo +" to "+ destination +"...");
      engine.move();
      driver.navigate(destination);
      System.out.println("Delivery of " + cargo + " completed.\n");
    }
}