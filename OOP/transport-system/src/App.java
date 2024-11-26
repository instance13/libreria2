public class App {
    public static void main(String[] args) {
        Car car = new Car("marca", "modelo", 2005, 4, 4, FuelType.ELECTRIC); 

        car.move();
        car.moveFoward();
        car.stop();
        car.turnOff();
    }
}
