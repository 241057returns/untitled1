package Tyuukankadai;

public class Main {
    public static void main(String[] args) {
        //インスタンス化
        Hero hero1 = new Hero();
        Hero hero2 = new Hero();

        //操作
        hero1.greeting();
        hero2.attack();
        hero1.skill(hero1);
        hero2.protect();
        hero1.escape();
    }
}
