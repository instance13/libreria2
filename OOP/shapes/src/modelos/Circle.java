package OOP.shapes.src.modelos;

public class Circle extends Figure<Circle>{
  private Double radius;
  private static int circleCounter;

  @Override
  public void printTheCreatedFigures(Circle[] Circles) {
    for (int i = 0; i < circleCounter; i++) {
      System.out.printf("---\n[Circle %d]\nRadius: %.2f\nWidth: %.2f\n---", i, radius);
    }
  };

  public static int getCircleCounter() {
    return circleCounter;
  }

  public static void setCircleCounter(int circleCounter) {
    Circle.circleCounter = circleCounter;
  }

  public void setRadius(Double radius) {
    this.radius = radius;
  }

  public Double getRadius() {
    return radius;
  }

  public Circle(Double radius) {
    this.radius = radius;
  }

  @Override
  public Double area() {
    return Math.PI * Math.pow(this.radius, 2);
  }

  @Override
  public Double perimeter() {
    return 2 * (Math.PI * this.radius);
  }
}
