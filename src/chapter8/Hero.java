package chapter8;

public class Hero {
   String name;
   int hp;
   int level;
   public void sleep(){
      this.hp = 100;//this このクラスの
      System.out.println(this.name + "は、眠って回復した！");
   }

   public void sit(int sec){
      System.out.println(this.name + "は、" + sec + "座った！");
      System.out.println("HPが、" + sec + "ポイント回復した！");
   }
   public void slip(){
      System.out.println(this.name + "は、転んだ！");
      System.out.println("5のダメージ！");
   }
   public void run(){
      System.out.println(this.name + "は、逃げだした！");
      System.out.println("GAME OVER");
      System.out.println("最終HPは、" + this.hp + "でした。");
   }
}
