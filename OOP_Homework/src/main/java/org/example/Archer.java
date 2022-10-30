package org.example;

public class Archer extends Hero {

    public Archer(String name) {
        super(name);
        super.health = 135;
    }
    @Override
    public void attackEnemy(Enemy enemy){
        System.out.println("Archer " + name + " attacks an enemy with a bow and arrows");
        enemy.takeDamage(20);
    }
    public void superPower(Enemy enemy){
        System.out.println("Archer " + name + " is going to do a headshot");
        int num = (int) (Math.random() * 2);
        if (num == 1) {
            System.out.println("\t\tSucceeded");
            enemy.setHealth(0);
        }
    }
}
