import java.util.Scanner;

public class Exponent {

    // note to self: it's important to make this function double, with int variable 
    // it won't be able to calculate (1 / base) which is basically a double

    static double power(double base, double exponent){

        double result = 1;
        if (exponent < 0){
            for(int i = (int) exponent; i != 0; i++){
                result = result * (1 / base);
            }
        } else {
            for (int i = 0; i < exponent; i++){
                result = result * base;
            }
        }
        return result;
    }
    public static void main(String[] args) throws Exception {

        double user_base, user_exponent;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        user_base = sc.nextDouble();
        System.out.print("Enter exponent: ");
        user_exponent = sc.nextDouble();

        double pow = power(user_base, user_exponent);

        System.out.println(user_base + " to the power " + user_exponent + " is " + pow);
    }
}
