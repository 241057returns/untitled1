package chapter10;

public class Main {
    public static void main(String[] args) {

        SuperHero sh = new SuperHero();
        Matango m = new Matango();
        m.hp = 100;

        sh.run();

        sh.attack(m);
    }
}
