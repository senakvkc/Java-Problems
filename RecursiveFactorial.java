import java.util.Scanner;

public class App {

    // Recursive function to calculate Factorial of a given number
    static long Factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        } else {
            return n * Factorial(n-1);
        }
    }
    public static void main(String[] args) throws Exception {
        int user_input;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you want to calculate its factorial(You cannot calculate the factorial of a negative number): ");
        user_input = scan.nextInt();

        long fac = Factorial(user_input);
        System.out.println("Factorial of " + user_input + " is " + fac);
    }
}
