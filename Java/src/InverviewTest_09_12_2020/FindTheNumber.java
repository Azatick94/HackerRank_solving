//package InverviewTest_09_12_2020;
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//
//
//class Result {
//
//    /*
//     * Complete the 'findNumber' function below.
//     *
//     * The function is expected to return a STRING.
//     * The function accepts following parameters:
//     *  1. INTEGER_ARRAY arr
//     *  2. INTEGER k
//     */
//
//    public static String findNumber(List<Integer> arr, int k) {
//        // Write your code here
//
//        for (int i = 0; i < arr.size(); i++) {
//            if (arr.get(i)==k)
//                return "YES";
//        }
//        return "NO";
//
//    }
//
//
//
//public static class FindTheNumber {
//
//
//}
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> arr = new ArrayList<>();
//
//        for (int i = 0; i < arrCount; i++) {
//            int arrItem = Integer.parseInt(bufferedReader.readLine().trim());
//            arr.add(arrItem);
//        }
//
//        int k = Integer.parseInt(bufferedReader.readLine().trim());
//
//        String result = Result.findNumber(arr, k);
//
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//
//}
//
