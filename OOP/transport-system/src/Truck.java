public class Truck extends Vehicle {

  public Truck(String brand, String model, int fabricationYear, int wheelsNum, int capacity, FuelType fuelType) {
    super(brand, model, fabricationYear, wheelsNum, capacity, fuelType);
  }

  @Override
  public void move() {
    System.out.println("Truck is moving.");
  };

  @Override
  public void stop() {
    System.out.println("Truck stopped.");
  };
}
