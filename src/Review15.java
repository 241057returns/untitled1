import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        InputStreamReader isr = new InputStreamReader(System.in);
        int num = Integer.parseInt(br.readLine());
        if(0 == num % 2){
            System.out.println("偶数");
        }else if(1 == num % 2){
            System.out.println("奇数");
        }else{
            System.out.println("無効な入力です。");
        }
    }
}
