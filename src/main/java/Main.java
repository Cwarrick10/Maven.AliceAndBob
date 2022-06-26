import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        String userNameA = "Alice";
        String  userNameB = "Bob";

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Name.");
        String name = sc.nextLine();
        if(name.equals(userNameA)|(name.equals(userNameB))){
            System.out.print("Hello how are you.");

        }
        else{
            System.out.println("GET OUT.");
        }


    }
}