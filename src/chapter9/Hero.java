package chapter9;

import chapter10.Matango;

public class Hero {
    String name;
    int hp;
    Sword sword;

    //コンストラクタ、これだけでnewした時に（この場合はHPを）自動設定してくれる
    public Hero(String input_name){
        this.hp = 100;
        this.name = input_name;
    }
    public Hero(){
        this.name = "ゲスト";
        this.hp = 100;
    }

    public void attack(Matango m){
        System.out.println(this.name + "は攻撃した！");
        System.out.println("敵に5ポイントのダメージをあたえた！");
    }
}
