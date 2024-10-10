package Java_Basics;
import java.util.Scanner;


public class ConditionalStatements {

    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);

        System.err.println("Enter your age : ");
        int age = takeInput.nextInt();

        if(age < 18) {
            System.out.println("You can not vote !");
        } else {
            System.out.println("You can vote now !");
        }

        takeInput.close();
    }
    
}
