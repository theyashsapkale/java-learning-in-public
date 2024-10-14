package Java_Basics;

public class DimondLoop {

   public static void main(String[] args) {
      for (int i = 0; i < 5; i++) {
         for (int k = 0; k < 5 - i; k++) {
            System.out.print(" ");
         }
         for (int j = 0; j <= i; j++) {
            System.out.print("* ");
         }
         System.out.println();
      }

      for (int x = 1; x < 5; x++) {
         for (int z = 0; z <= x; z++) {
            System.out.print(" ");
         }
         for (int y = 0; y < 5 - x; y++) {
            System.out.print("* ");
         }
         System.out.println();
      }
   }
}
