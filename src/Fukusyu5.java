import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fukusyu5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(br.readLine());
        if (age >= 64) {
            System.out.println("シニア");
        } else if (age >= 20) {
            System.out.println("大人");
        } else if (age >= 13){
            System.out.println("ティーンエイジャー");
        } else if (age >= 0){
            System.out.println("子ども");
        }

    }
}
