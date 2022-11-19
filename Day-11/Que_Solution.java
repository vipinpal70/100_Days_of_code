import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Solution
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 64 * 1024);

        final String S = br.readLine();   // reading String 
        final String[] res = S.split("[^A-Za-z]+");    // apply regular EXPRESSIONS 

        final StringBuilder sb = new StringBuilder();   // CREATING A NEW STRING 

        int cnt = 0;
        for (int i = 0; i < res.length; i++) {
            if (res[i].length() > 0) {
                cnt++;
                sb.append(res[i]).append('\n');    // ADDING VALUES INTO STRING 
            }
        }

        System.out.println(cnt);
        System.out.print(sb.toString());    // PRINTING STRING

        br.close();
        br = null;
    }
}
