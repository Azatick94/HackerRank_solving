package JavaBasic;
import java.io.*;
import java.util.*;


public class JavaArrayList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        // first line
        int numberN = scan.nextInt();


        scan.nextLine();
        List<String[]> arrayList = new ArrayList(); // здесь содержатся данные

        for (int i=0; i<numberN; i++) {
            String line = scan.nextLine();
            String[] words = line.split(" ");

            if (words.length!=0) {
                String[] newArray = Arrays.copyOfRange(words, 1, words.length);
                arrayList.add(newArray);
            }


        }


        int numberQueries = scan.nextInt();
        System.out.println(numberQueries);









        }
    }
