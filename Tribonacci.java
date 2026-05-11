public class Tribonacci {


    static int tribonacci(int n ){
        if (n == 0 ){
            return 0;
        }else if (n == 1 || n == 2){
            return 1;
        }

        int ft = 0 ;
        int st = 1 ;
        int tt = 1 ;
        for (int i = 3; i <= n; i++) {
            int nextNum = ft + st + tt ;    
            ft = st ;
            st = tt ;
            tt = nextNum ;
        }
        return tt ;
    }
    public static void main(String[] args) {
        
      System.out.println(tribonacci(4));
    }
}