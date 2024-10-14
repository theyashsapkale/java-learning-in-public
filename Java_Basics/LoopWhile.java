package Java_Basics;

// import java.util.*;
public class LoopWhile {

    public static void uppeSpaceLoop(int row) {

        int i = 0;
        while (i < row) {

            int k = 0;
            while (k <= row - i) {
                System.out.print(" ");
                k++;
            }
            int j = 0;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

    }

    public static void bottomSpaceLoop(int row) {

        int i = 5;
        while (i > 0) {
            int k = 1;
            while (k <= (row - i) + 1) {
                System.out.print(" ");
                k++;
            }
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }

    public static void halfTiangle(int row) {
       
        int i = 1;

        while (i <= row) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void halfUp( int i ) {
        
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }

    public static void main(String[] args) {
        uppeSpaceLoop(5);
        

        // bottomSpaceLoop(5);
        // System.out.println();

        // halfTiangle(5);
        // System.out.println();

        // halfUp(5);
        // System.out.println();
    }
}
