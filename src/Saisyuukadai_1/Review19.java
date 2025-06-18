public class Review19 {
    public static void main(String[] args) {
        int num = 5;
        int factorial = 1;
        int i = 1;

        while (i <= num) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("結果:" + factorial);
    }
}