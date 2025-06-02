package Rensyumondai6point8;
import Rensyumondai6point8.Zenhan;

import java.io.IOException;

import static Rensyumondai6point8.Zenhan.doTogame;

public class Kouhan {
    public static void callDeae()  {
        System.out.println("えぇい、こしゃくな。くせ者だ！であえい！");
    }
    public static void showMondokoro() throws IOException {
        System.out.println("飛車さん、角さん。もういいでしょう。");
        System.out.println("<この紋所が目にはいらぬか！");
        doTogame();//もう一度、とがめる
    }
}
