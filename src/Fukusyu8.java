

public class Fukusyu8 {
    public static void main(String[] args) {


        int[] intArray = new int[]{3, 5, 7, 2, 8, 6};
        int upWork = 0;
        int dnWork = 0;
        for (int i = 0; i < 6; i++) {
            if (intArray[i] > upWork) {
                upWork = intArray[i];
            }
            if (intArray[i] < dnWork) {
                dnWork = intArray[i];
            }
        }
        System.out.println(upWork);
        System.out.println(dnWork);
    }
}
