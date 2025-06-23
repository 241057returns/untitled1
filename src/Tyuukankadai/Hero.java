package Tyuukankadai;

public class Hero extends Character {
    //コンストラクタ
    public Hero(String name) {
        super(name);
    }

    //操作
    //オーバーライド
    void greeting(String name) {
        System.out.println(this.name + "は、「こんにちは」とあいさつをした！");
    }
    //オーバーライド
    void attack(String name){
        System.out.println(this.name + "は、つるぎでこうげきした！");
    }

    public void skill(Hero hero){  //スキルメソッド
        System.out.println(hero.name + "は、ホイミをとなえた！");
        this.hp += 10;
        System.out.println(hero.name + "のHPが10かいふくした！");
    }
    //オーバーライド
    void escape(){
        System.out.println(this.name + "は、にげだした！");
    }
}
