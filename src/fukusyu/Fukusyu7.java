package fukusyu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fukusyu7  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int j = 1; j <= num; j++) {
            if (j % 2 == 1) {
                sum += j;
            }
        }
        System.out.println("結果: " + sum);
    }
}
