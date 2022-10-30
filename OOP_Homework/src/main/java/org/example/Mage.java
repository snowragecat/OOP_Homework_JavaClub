package org.example;

public class Mage extends Hero{
    public Mage(String name) {
        super(name);
        super.health = 130;
    }
    @Override
    public void attackEnemy(Enemy enemy){
        System.out.println("Mage " + name + " attacks an enemy with magic");
        enemy.takeDamage(25);
    }
    @Override
    public void superPower(Enemy enemy){
        System.out.println("    Mage " + name + " is trying to heal and attack");
        int num = (int) (Math.random() * 5);
        if (num == 2 || num == 1){
            System.out.println("\t\tSucceeded");
            health += 25;
            attackEnemy(enemy);
        }
    }
}
