public class ImprimirArray {

  public static void main(String[] args) {
    int[] intArr = { 1, 2, 3 };
    int[][] intMatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    String[] strArr = { "Hello", "World", "!" };
    String[][] strMatrix = { { "Hello", "World" }, { "HI", "Word" }, { "!", "&%$", "?" } };

    printCollection(intArr);
    printCollection(intMatrix);
    printCollection(strArr);
    printCollection(strMatrix);
  }

  public static void printCollection(int[] collection) {
    for (int i : collection) {
      System.out.printf(" [%d] ", i);
    }
    System.out.println("");
  }

  public static void printCollection(int[][] collection) {
    System.out.println("---");
    for (int i = 0; i < collection.length; i++) {
      System.out.print("  |  ");
      for (int j = 0; j < collection.length; j++) {
        System.out.printf("[%d]", collection[i][j]);
      }
      System.out.print("  |  ");
    }
    System.out.println("\n---");
  }

  public static void printCollection(String[] collection) {
    for (String i : collection) {
      System.out.printf(" [%s] ", i);
    }
    System.out.println("");
  }

  public static void printCollection(String[][] collection) {
    System.out.println("---");
    for (int i = 0; i < collection.length; i++) {
      System.out.print("  |  ");
      for (int j = 0; j < collection[i].length; j++) {
        System.out.printf("[%s]", collection[i][j]);
      }
      System.out.print("  |  ");
    }
    System.out.println("\n---");
  }
}
