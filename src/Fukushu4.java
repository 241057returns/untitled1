import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Fukushu4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputNum = br.readLine();
        int num = Integer.parseInt(inputNum);
        if(num > -1){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
    }
}
