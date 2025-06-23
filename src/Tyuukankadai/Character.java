package Tyuukankadai;

public abstract class Character extends Creature {
    //属性
    String name;
    int hp;

    //コンストラクタ
    public Character(String input_name) {
        name = input_name;
        hp = 100;
    }

    //操作
    public abstract void attack();           //こうげきメソッド
    public abstract void skill(Hero hero);   //スキルメソッド
    public void protect(){                        //守るメソッド
        System.out.println(this.name + "は、まもりのたいせいにはいった！");
    }
}