package chapter10;

public class SuperHero extends Hero {
    boolean flying;

    public void fly(){
        this.flying = true;

    }
    public void land(){
        this.flying = false;
        System.out.println("着地！");
    }

    @Override
    public void run() {
        System.out.println("撤退した！");
    }
    public void attack(Matango m){
        System.out.println(this.name + "は攻撃した！");
        m.hp -= 50;
        if(this.flying){
            System.out.println(this.name + "は攻撃した！");
            m.hp -= 50;
            System.out.println("5のダメージ！");
        }
        System.out.println("敵に5ポイントのダメージをあたえた！");
    }
}
