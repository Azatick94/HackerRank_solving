package InverviewTest_09_12_2020;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

class Result {

    /*
     * Complete the 'getUsernames' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts INTEGER threshold as parameter.
     *
     * URL for cut and paste
     * https://jsonmock.hackerrank.com/api/article_users?page=<pageNumber>
     */

    public static List<String> getUsernames(int threshold) throws IOException {

        Map<String, Integer> mapUsers = new LinkedHashMap<>();
        String urlBase = "https://jsonmock.hackerrank.com/api/article_users?page=";
        String USER_AGENT = "Mozilla/5.0";

        // parsing first 10 pages
        final int parseCountPages = 10;
        for (int i = 1; i < parseCountPages; i++) {
            String url = urlBase+i;
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            // optional default is GET
            con.setRequestMethod("GET");
            //add request header
            con.setRequestProperty("User-Agent", USER_AGENT);
            // reading get request result
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            String splitterResponse = response.toString().split("data\":")[1];
            splitterResponse = splitterResponse.substring(1, splitterResponse.length()-2);

            if (splitterResponse.length()>5) {
                List<String> lstUsers = Arrays.asList(splitterResponse.split("},"));
                for (String userInfo: lstUsers) {

                    String name = userInfo.split("username\":\"")[1].split(",")[0].replaceAll("\"", "");
                    Integer submissionCount = Integer.parseInt(userInfo.split("submission_count\":")[1].split(",")[0]);
                    mapUsers.put(name, submissionCount);
                }
            }
        }

        List<String> result = new ArrayList<String>();
        for(Map.Entry<String,Integer> entry : mapUsers.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value>threshold)
                result.add(key);
        }

        return result;
    }

}

public class MostActiveUsers {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int threshold = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> result = Result.getUsernames(threshold);
//
//        for (int i = 0; i < result.size(); i++) {
//            bufferedWriter.write(result.get(i));
//
//            if (i != result.size() - 1) {
//                bufferedWriter.write("\n");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }


}
