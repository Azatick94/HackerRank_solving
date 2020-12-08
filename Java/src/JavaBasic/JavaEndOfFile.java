package JavaBasic;

import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        while (true) {

            if (!scanner.hasNext()) {
                scanner.close();
                break;
            }
            else {
                System.out.println(count+" "+scanner.nextLine());
                count++;

            }

        }



    }
}
