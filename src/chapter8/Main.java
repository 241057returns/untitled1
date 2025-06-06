package chapter8;

public class Main {
    public static void main(String[] args) {
        //
        //実態化 　/*　Hero h = new Hero();の様な書き方はオブジェクト指向において、滅茶苦茶使うので覚えよう（提案）*/
        //実体化　＝　インスタンス化　というらしい
        Hero h = new Hero();

        Matango m = new Matango();
        Matango m2 = new Matango();

        h.name = "コニタン";
        h.hp = 100;
        System.out.println("勇者" + h.name + "を生み出した！");
        //操作1
        h.sit(5);
        h.slip();
        h.sit(25);
        h.run();
    }
}
