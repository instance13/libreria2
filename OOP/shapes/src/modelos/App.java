package OOP.shapes.src.modelos;

import java.util.Arrays;
import java.util.Scanner;
public class App {

    private static Rectangle[] rectanglesCreated = new Rectangle[10];
    private static Triangle[] trianglesCreated = new Triangle[10];
    private static Circle[] circlesCreated = new Circle[10];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("--- Welcome to The Geometric App ---");
        int option;

        do {
            displayMenu();
            option = sc.nextInt();

            switch (option) {
                case 1:
                    rectanglesCreated = handleRectangleOperations(rectanglesCreated);
                    break;
                case 2:
                    trianglesCreated = handleTriangleOperations(trianglesCreated);
                    break;
                case 3:
                    circlesCreated = handleCircleOperations(circlesCreated);
                    break;
                case 4:
                    System.out.println("See you later. Have a nice day!");
                    break;
                default:
                    break;
            }
        } while (option != 4);

        sc.close();
    }

    // Menu display method
    private static void displayMenu() {
        System.out.printf("\n1. Rectangle.\n2. Triangle.\n3. Circle\n4.Exit.\n");
        System.out.print("Enter an option: ");
    }

    // Handle Rectangle Operations
    private static Rectangle[] handleRectangleOperations(Rectangle[] rectangles) {
        System.out.println("First, create a rectangle!");

        Rectangle rectangle = createRectangle();
        rectangles = addToArray(rectangles, rectangle, Rectangle.getRectanglesCount());

        System.out.println("Rectangle created! You can now operate on it.");
        return rectangles;
    }

    // Handle Triangle Operations
    private static Triangle[] handleTriangleOperations(Triangle[] triangles) {
        System.out.println("First, create a triangle!");

        Triangle triangle = createTriangle();
        triangles = addToArray(triangles, triangle, Triangle.getTriangleCounter());

        System.out.println("Triangle created! You can now operate on it.");
        return triangles;
    }

    // Handle Circle Operations
    private static Circle[] handleCircleOperations(Circle[] circles) {
        System.out.println("First, create a circle!");

        Circle circle = createCircle();
        circles = addToArray(circles, circle, Circle.getCircleCounter());

        System.out.println("Circle created! You can now operate on it.");
        return circles;
    }

    // Methods to create a Figure:
    private static Rectangle createRectangle() {
        System.out.print("Enter the height of the rectangle: ");
        double height = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();

        return new Rectangle(height, width);
    }

    private static Triangle createTriangle() {
        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();
        System.out.print("Enter the base of the triangle: ");
        double width = sc.nextDouble();

        return new Triangle(height, width);
    }

    private static Circle createCircle() {
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        return new Circle(radius);
    }

    // Generic array resizing and adding method
    private static <T> T[] addToArray(T[] array, T newElement, int count) {
        if (count >= array.length) {
            array = Arrays.copyOf(array, array.length * 2); // Double the array size to avoid outofboundexception
        }
        array[count] = newElement;
        return array;
    }
}
