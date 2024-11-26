public class Car extends Vehicle implements Driveable {

  public Car(String brand, String model, int fabricationYear, int wheelsNum, int capacity, FuelType fuelType) {
    super(brand, model, fabricationYear, wheelsNum, capacity, fuelType);
  }

  @Override
  public void move() {
    System.out.println("Car is moving.");
  };

  @Override
  public void moveFoward() {
    System.out.println("Car is moving foward.");
  }

  @Override
  public void turnOff() {
    System.out.println("Car has been turn off.");
  }

  @Override
  public void stop() {
    System.out.println("Car stopped.");
  };
}
