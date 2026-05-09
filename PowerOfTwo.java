public class PowerOfTwo {

    static boolean PowerOfTWO(int n ) {
      if ( n < 1){
        return false;
      }else if (n == 1 ){
        return true;
      } else{
        while(n %2 == 0){
            n = n/2;
        }
        if (n == 1) {
            return true;
        }else{
            return false;
        }
         }
            

    }
    public static void main(String[] args) {
        int n  = 19;
        boolean result = PowerOfTWO(n);
        System.out.println(result);
    }
}
