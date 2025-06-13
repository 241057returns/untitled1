package chapter10;

public class Hero {
    String name = "ミナト";
    int hp = 100;

    public void attack() {
        System.out.println(this.name + "のこうげき");
        hp -= 5;
        System.out.println("5のダメージ！");
    }

    public void run(){
        System.out.println("逃げ出した！");
    }
}
