import java.util.*;;
public class New {

    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);

      int i=sc.nextInt();
     sc.close();
      for(  i=0; i<=4; i++){
      for(int j=0; j<=i; j++){
          System.out.print ("*");
      }
        System.out.println("");
      }
      
      for( i=4; i>0; i--){
     for (int j=0; j<i; j++){
        System.out.print("*");
     }
        System.out.println();
      }
  
    }
}
