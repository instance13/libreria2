package OOP.shapes.src.modelos;
/*
Crea una clase llamada Rectangulo

Define 2 atributos para la clase: ancho y alto. Pueden ser números decimales o enteros.

Define un atributo de tipo entero, 'contadorRectangulos', que sea estático y que lleve un registro del número total de instancias de 'Rectangulo' creadas.

Diseña un constructor con argumentos que inicialice los valores del 'ancho' y 'alto', y que incremente en uno el valor de 'contadorRectangulos'. 

Implementa un método llamado 'area()' y otro método llamado 'perimetro()', responsables de calcular el área y el perímetro del rectángulo, respectivamente.

Implementa un método llamado imprimirArea para mostrar el resultado por consola;

Implementa un método llamado imprimirPerimetro para mostrar el resultado por consola;

Implementa un método estático que permita obtener el número total de rectángulos creados hasta el momento.

Desarrolla un menú interactivo que permita al usuario crear instancias de 'Rectangulo' y acceder a sus métodos para obtener información relevante.
 */


// Now T is Rectangle
public class Rectangle extends Figure<Rectangle>{
  private Double height;
  private Double width;

  private static int rectangleCounter;

  Rectangle(Double height, Double width) {

    this.height = height;
    this.width = width;

    rectangleCounter++;
  }

  Rectangle() {
  }

  @Override // -> this is an anotation. there are other types
  public Double area() {
    return this.height * this.width;
  }

  @Override
  public Double perimeter() {
    return 2 * (this.height + this.width);
  }
  
  @Override 
  public void printTheCreatedFigures(Rectangle[] rectangles) {
    for (int i = 0; i < rectangleCounter; i++) {
      System.out.printf("---\n[Rectangle %d]\nHeight: %.2f\nWidth: %.2f\n---", i, height, width);
    }
  };

  // area and perimter methods will be called in these methods !

  public void printArea(Double area) {
    System.out.printf("The rectangle's area is: %.2f\n", area);
  }

  public void printPerimeter(Double perimeter) {
    System.out.printf("The rectangle's perimeter is: %.2f\n", perimeter);
  }

  public Double getHeight() {
    return this.height;
  }

  public Double getWidth() {
    return this.width;
  }

  public static int getRectanglesCount() {
    return rectangleCounter;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public static void setRectanglesCount(int count) {
    rectangleCounter = count;
  }

  public void printRectangleData() {
    System.out.printf("Rectangle data:\n1.Height:%.2f\nWidth:%.2f\nArea: %.2f\nPerimeter: %.2f", this.height, this.width, area(), perimeter());
  }
}
