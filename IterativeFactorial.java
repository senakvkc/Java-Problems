import java.util.Scanner;

public class App {

    static long Factorial(int n){
        long result = 1;
        for(int i = 2; i <= n; i++){
            result = result * i;
        }
        return result;
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
