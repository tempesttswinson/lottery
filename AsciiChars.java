public class AsciiChars {

  public static void printNumbers() {
    int i;
    for (i = 0; i <= 122; i++) {
      System.out.println("The ASCII value of " + (char) i + " = " + i);
      System.out.println();
    }
  }

  public static void printLowerCase() {
    for (int i = 97; i <= 122; i++) {
      System.out.println("The ASCII value of " + (char) i + " = " + i);
      System.out.println();
    }
  }

  public static void printUpperCase() {
    for (int i = 65; i <= 90; i++) {
      System.out.println("The ASCII value of " + (char) i + " = " + i);
      System.out.println();
    }
  }
}