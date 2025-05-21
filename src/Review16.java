import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int j = 1; j <= i; j++) {
            sum += j;
        }
        System.out.println(sum);
    }
}
