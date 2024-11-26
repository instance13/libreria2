enum FuelType {
  GASOLINE,
  DIESEL,
  ELECTRIC,
}

abstract class Vehicle {
  private String brand;
  private String model;
  private int fabricationYear;
  private int wheelsNum;
  private int capacity;
  private FuelType fuelType;

  public Vehicle(String brand, String model, int fabricationYear, int wheelsNum, int capacity, FuelType fuelType) {
    this.brand = brand;
    this.model = model;
    this.fabricationYear = fabricationYear;
    this.wheelsNum = wheelsNum;
    this.capacity = capacity;
    this.fuelType = fuelType;
  }

  public FuelType getFuelType() {
    return fuelType;
  }

  public void setFuelType(FuelType fuelType) {
    this.fuelType = fuelType;
  }

  public abstract void move();

  public abstract void stop();

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getFabricationYear() {
    return fabricationYear;
  }

  public void setFabricationYear(int fabricationYear) {
    this.fabricationYear = fabricationYear;
  }

  public int getWheelsNum() {
    return wheelsNum;
  }

  public void setWheelsNum(int wheelsNum) {
    this.wheelsNum = wheelsNum;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

}