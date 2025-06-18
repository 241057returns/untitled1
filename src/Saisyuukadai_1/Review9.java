import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review9 {
    public static void main(String[] args) throws IOException { // IOExceptionのスローが必要
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("名前を入力してください>");
        String inputName = br.readLine();
        System.out.print("年齢を入力してください>");
        String inputAgeStr = br.readLine();
        int age = Integer.parseInt(inputAgeStr); 
        System.out.println(age + "歳の" + inputName + "さん。"); 
        System.out.println("こんにちは。"); 
    }
}