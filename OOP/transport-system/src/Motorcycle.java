public class Motorcycle extends Vehicle {

  public Motorcycle(String brand, String model, int fabricationYear, int wheelsNum, int capacity, FuelType fuelType) {
    super(brand, model, fabricationYear, wheelsNum, capacity, fuelType);
  }

  @Override
  public void move() {
    System.out.println("Motorcycle is moving.");
  };

  @Override
  public void stop() {
    System.out.println("Motorcycle stopped.");
  };
}
