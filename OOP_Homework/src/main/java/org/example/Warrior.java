package org.example;

public class Warrior extends Hero{
    public Warrior(String name) {
        super(name);
        super.health = 150;
    }

    @Override
    public void attackEnemy(Enemy enemy){
        System.out.println("Warrior " + name + " attacks an enemy with a sword");
        enemy.takeDamage(30);
    }
    @Override
    public void superPower(Enemy enemy){
        //System.out.println("The superpower is invulnerability");
        System.out.println("    Warrior " + name + " is trying to become invulnerable");
        int num = (int) (Math.random() * 3);
        if (num == 2 || num == 1){
            System.out.println("\t\tSucceeded");
            health += enemy.damage;
        }
    }
}
