import java.util.Random;

public class GenrateOtp {

    static void genrateOtp(){
        Random r = new Random();
        int otp = r.nextInt(9000)+1000;
        System.out.println(otp);
    }

    static void RandomNum(){
        int otp = (int)(Math.random()*9000)+1000;
        System.out.println(otp);
    }
    public static void main(String[] args) {
        genrateOtp();
        RandomNum();
    }
}
