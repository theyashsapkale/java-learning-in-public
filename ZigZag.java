public class ZigZag {

    // Left Top Pattern
    public static void leftTop(int n) {
        int i = 1;

        while (i <= n) {

            int j = 0;
            while (j < (n - i)) {
                System.err.print(" ");
                j++;
            }

            int k = 1;
            while (k <= i) {
                System.err.print("*");
                k++;
            }

            // Inserting new line
            System.err.println();
            i++;
        }

    }

    // Right Top Pattern
    public static void rightTop(int n) {

        int i = 1;

        while (i <= n) {

            int k = 1;
            while (k <= i) {
                System.err.print("*");
                k++;
            }

            // Inserting new line
            System.err.println();
            i++;
        }

    }

    // Left Bottom Pattern
    public static void leftBottom(int n) {
        int i = 1;

        while (i <= n) {

            int j = 1;
            while (j < (n - (n - i))) {
                System.err.print(" ");
                j++;
            }

            int k = 1;
            while (k <= (n - i + 1)) {
                System.err.print("*");
                k++;
            }

            // Inserting new line
            System.err.println();
            i++;
        }
    }

    // Right Bottom Patter
    public static void rightBottom(int n) {
        int i = 0;

        while (i < n) {

            int j = 1;
            while (j <= (n - i)) {
                System.err.print("*");
                j++;
            }

            // Inserting new line
            System.err.println();
            i++;
        }
    }

    // Zig Zag Pattern
    public static void zigZagPattern(int n) {

        int i = 0;
        while (i < n) {

            // Left Top Left
            int j = 0;
            while (j < i) {
                System.err.print(" ");
                j++;
            }

            System.err.print("*");

            // Left Top Right
            int i1 = 0;
            while (i1 < (n - i)) {
                System.err.print(" ");
                i1++;
            }

            // Right Top Left

            int i2 = 0;
            while (i2 < (n - i - 1)) {
                System.out.print(" ");
                i2++;
            }

            // Right Top Right
            int i3 = 0;
            while (i3 <= i) {
                if (i3 == 0) {
                    System.out.print("*");
                }
                i3++;
            }

            System.err.println();
            i++;

        }

        int k = 0;
        while (k < n) {

            System.err.print(" ");
            k++;

        }
        System.out.print("*");
        System.out.println();

        int j = 0;
        while (j < n) {

            // Left Bottom Left
            int i2 = 0;
            while (i2 < (n - j)) {
                if (i2 != (n - (j + 1))) {
                    System.out.print(" ");
                }
                if (i2 == (n - (j + 1))) {
                    System.out.print("*");
                }
                i2++;
            }

            // Left Bottom Right
            int i3 = 0;
            while (i3 <= j) {
                System.out.print(" ");
                i3++;
            }

            // Right Bottom Left
            int i4 = 0;
            while (i4 < j) {
                System.out.print(" ");
                i4++;
            }

            // Right Bottom Right
            int i5 = 0;
            while (i5 <= j) {
                if (i5 == 0) {
                    System.out.print("*");
                }
                i5++;
            }

            System.err.println();
            j++;

        }

    }

    public static void main(String[] args) {

        int n = 5;
        // leftTop(n);
        // rightTop(n);
        // leftBottom(n);
        // rightBottom(n);
        zigZagPattern(n);

    }

}
