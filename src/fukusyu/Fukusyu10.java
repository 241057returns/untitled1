package fukusyu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fukusyu10  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        int j = 1;
        while (j <= num) {
            j =+ 1;
            if (j % 2 == 0) {
                sum += j;
            }
        }
        System.out.println("結果: " + sum);
    }
}