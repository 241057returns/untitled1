package fukusyu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fukusyu11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int mult = 1;
        for (int i = 1; i <= num; i++) {
            mult *= i;
        }
        System.out.println(mult);
    }
}
