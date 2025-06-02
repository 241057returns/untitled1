package fukusyu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fukusyu6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if(0 == num % 3 && 0 == num % 5){
            System.out.println("FizzBuzz");
        }else if(0 == num % 3){
            System.out.println("Fizz");
        }else if(0 == num % 5){
            System.out.println("Buzz");
        }
    }
}
