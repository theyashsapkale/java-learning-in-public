public class ForLoop {

  public static void newLoop() {

    for (int i = 0; i < 5; i++) {
      for (int k = 0; k < 5 - i; k++) {
        System.out.print(" ");
      }
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void newLoop2() {

    for (int i = 0; i <= 4; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void newLoop3() {

    for (int i = 0; i < 4; i++) {
      for (int k = 0; k < i; k++) {
        System.out.print(" ");
      }
      for (int j = 0; j < 4 - i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }

  public static void newLoop4() {
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4 - i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {

    newLoop();
    System.out.println();
    newLoop2();
    System.out.println();
    newLoop3();
    System.out.println();
    newLoop4();
  }
}
