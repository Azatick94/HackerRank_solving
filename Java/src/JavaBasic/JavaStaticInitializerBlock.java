package JavaBasic;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

    static boolean flag;
    static int B, H;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        scanner.close();
        flag = B > 0 && H > 0;
        if (!flag) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) throws Exception {


        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main


}
