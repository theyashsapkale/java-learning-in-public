/**
 * Star
 
    $
   $$$
  $$$$$
 $$$$$$$
  
 */
import java.util.*;


public class Star {
        
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number of rows : ");
    int n= sc.nextInt();
    sc.close();

        for(int i=1; i<=n; i++){
           for(int j=0; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<(i+(i-1)); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
