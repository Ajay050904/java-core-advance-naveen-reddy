
import java.util.Scanner;

public class ConditionalDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("It is a Positive number");
        } else if (num < 0) {
            System.out.println("It is a Negative number");
        } else {
            System.out.println("Number is Zero");
        }

        sc.close();
    }
}
