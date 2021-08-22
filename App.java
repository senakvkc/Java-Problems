import java.util.Scanner;

public class App {

    // Recursive Power Function 

    static double Power (double base, double exponent) {
        // double result = 1;
        if(exponent == 0){
            return 1;
        } else if(exponent == 1){
            return base;
        } else if(exponent > 1){
            return (base * Power(base, exponent - 1));
        } else {
            return (1 / Power(base, -exponent));
        }
    }

    public static void main(String[] args) throws Exception {
        double user_base, user_exponent;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter base: ");
        user_base = scan.nextDouble();
        System.out.print("Enter exponent: ");
        user_exponent = scan.nextDouble();

        double pow = Power(user_base, user_exponent);
        System.out.println(user_base + " to the power " + user_exponent + " is " + pow);
    }
}
