package JavaBasic;
import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            //Write your code
            try {
                Pattern compiled = Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch (Exception exception) {
                System.out.println("Invalid");
            }

            testCases--;

        }
    }

    
}