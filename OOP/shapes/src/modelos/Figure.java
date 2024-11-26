package OOP.shapes.src.modelos;

// this is a constraint
public abstract class Figure<T extends Figure<T>> {

  public abstract Double area();
  public abstract Double perimeter();

  public abstract void printTheCreatedFigures(T[] figures); // this is an abstract method that uses generics :p

  public void printArea() {
    System.out.printf("The figure's area is: %.2f\n", this.area());
  }

  public void printPerimeter() {
    System.out.printf("The figure's perimeter is: %.2f\n", this.perimeter());
  }
}
