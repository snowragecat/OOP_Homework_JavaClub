package org.example;

public class TrainingGround {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Hero h1 = new Hero("Captain");
        //h1.attackEnemy();

        Enemy e1 = new Enemy(100);
        System.out.println("Enemy health is: " + e1.getHealth());

        Warrior w1 = new Warrior("Thor");
        w1.attackEnemy(e1);
        System.out.println("Enemy health is: " + e1.getHealth());
        Mage m1 = new Mage("Gandalf");
        m1.attackEnemy(e1);
        System.out.println("Enemy health is: " + e1.getHealth());
        Archer a1 = new Archer("Robin Hood");
        a1.attackEnemy(e1);
        System.out.println("Enemy health is: " + e1.getHealth());
    }
}