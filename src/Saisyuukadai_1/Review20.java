package Saisyuukadai_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review20 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("結果: " + sum);
    }
}
