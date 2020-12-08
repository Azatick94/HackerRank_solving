package JavaBasic;
import java.util.Scanner;

class MyCalc {
    /*
     * Create the method long power(int, int) here.
     */
    public String power(int n, int p) {
            if (n<0 || p <0)
                return "java.lang.Exception: n or p should not be negative";
            else if (n==0 && p==0)
                return "java.lang.Exception: n and p should not be zero.";
            else
                return String.valueOf(Math.pow(n, p));
    }

}

public class JavaExceptionHandling {

    public static final MyCalc my_calculator = new MyCalc();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }


}
