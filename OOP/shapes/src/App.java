package OOP.shapes.src;

import java.util.Arrays;
import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("/033/143");
    System.out.println("--- Welcome to The Geometric App ---");
    Scanner sc = new Scanner(System.in);

    Rectangle[] rectanglesCreated = new Rectangle[10];

    System.out.println("First of all, you need to create a rectangle!");

    System.out.print("Enter the height of the rectangle: ");
    Double height = sc.nextDouble();
    System.out.print("Enter the width of the rectangle: ");
    Double width = sc.nextDouble();

    Rectangle rectangle = new Rectangle(height, width);
    rectanglesCreated[Rectangle.getRectanglesCount() - 1] = rectangle;

    System.out.println("You are done. Now let's operate over the created rectangle.");

    int option;

    do {
      System.out.printf(
          "\n1. Print specific rectangle's area.\n2. Print specific rectangle's perimeter.\n3. Create another rectangle.\n4. Print all the rectangles.\n5. Exit.\n");

      System.out.print("Enter an option: ");
      option = sc.nextInt();

      // consume the \n character, also known as "clean the buffer".
      // sc.nextLine();

      int index;
      switch (option) {
        case 1:
          System.out.printf("Enter the index of the rectangle you want to access (index starts at 0): ");
          index = sc.nextInt();
          sc.nextLine();

          rectanglesCreated[index].printArea(rectanglesCreated[index].area());
          break;
        case 2:
          System.out.printf("Enter the index of the rectangle you want to access: (index starts at 0)");
          index = sc.nextInt();
          sc.nextLine();

          rectanglesCreated[index].printArea(rectangle.area());
          break;
        case 3:
          if (Rectangle.getRectanglesCount() >= rectanglesCreated.length) {
            rectanglesCreated = Arrays.copyOf(rectanglesCreated, rectanglesCreated.length * 2); // double the size of
                                                                                                // the array, if
            // the user exceeds the buffer size.
            // This solution was inspired from
            // malloc, realloc and macros from C
            // programming language!

            System.out.print("Enter the height of the rectangle: ");
            height = sc.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            width = sc.nextDouble();

            rectangle = new Rectangle(height, width);

            if (Rectangle.getRectanglesCount() < rectanglesCreated.length) {
              rectanglesCreated[Rectangle.getRectanglesCount() + 1] = rectangle;
            }
          } else {
            System.out.print("Enter the height of the rectangle: ");
            height = sc.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            width = sc.nextDouble();

            rectangle = new Rectangle(height, width);
            rectanglesCreated[Rectangle.getRectanglesCount() - 1] = rectangle;
          }
          break;
        case 4:
          printTheCreatedRectangles(rectanglesCreated);
          break;
        case 5:
          System.out.println("See you later. Have a nice day!");
          break;
      }

    } while (option != 5);

    sc.close();
  }

  public static void printTheCreatedRectangles(Rectangle[] rectanglesCreated) {
    for (int i = 0; i < Rectangle.getRectanglesCount(); i++) {
      if (rectanglesCreated[i] != null) { // Check if the element is not null
        System.out.printf("---\n[Rectangle %d]\nHeight: %.2f\nWidth: %.2f\n---\n",
            i + 1,
            rectanglesCreated[i].getHeight(),
            rectanglesCreated[i].getWidth());
      } else {
        // handle NullPointerException
        System.out.printf("[---\nRectangle %d]\nNo data (Rectangle is null)\n---\n", i + 1);
      }
    }
  }
}
