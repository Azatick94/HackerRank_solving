package JavaBasic;
import java.util.*;
import java.io.*;


public class JavaLoopsII {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int currentVal = (int) (a+Math.pow(2, 0)*b);
            System.out.print(currentVal+" ");

            for (int j = 1; j < n; j++) {
                currentVal+=Math.pow(2, j)*b;
                System.out.print(currentVal+" ");
            }
            System.out.println();
        }
        in.close();
    }

}
