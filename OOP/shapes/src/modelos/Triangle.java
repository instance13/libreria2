package OOP.shapes.src.modelos;

public class Triangle extends Figure<Triangle>{
  private Double height;
  private Double width;
  private Double sideA;
  private Double sideB;
  private Double sideC;

  private static int triangleCounter;

  public Triangle(Double height, Double width) {
    this.height = height;
    this.width = width;
  }

  @Override
  public void printTheCreatedFigures(Triangle[] Triangles) {
    for (int i = 0; i < triangleCounter; i++) {
      System.out.printf("---\n[Triangle %d]\nHeight: %.2f\nWidth: %.2f\n---", i, height, width);
    }
  };

  public static int getTriangleCounter() {
    return triangleCounter;
  }

  public static void setTriangleCounter(int triangleCounter) {
    Triangle.triangleCounter = triangleCounter;
  }

  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  @Override
  public Double area() {
    return (this.height * this.width) / 2;
  }
  
  @Override
  public Double perimeter() {
    return sideA + sideB + sideC;
  }
}
