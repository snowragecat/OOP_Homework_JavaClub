package org.example;

public class Zombie extends Enemy{
    public Zombie(int health) {
        super(health);
        super.damage = 2;
        type = "Zombie";
    }
    @Override
    public void enemySuperPower(Hero hero){
        if (!isAlive()) {
            System.out.println("    " + type + " is trying to resurrect and attack");
            int num = (int) (Math.random() * 5);
            if (num == 4) {
                System.out.println("\t\tSucceeded");
                health = 50;
                hero.setHealth((hero.health - 5));
            }
        }
    }
}
