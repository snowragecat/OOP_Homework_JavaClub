package org.example;

public class Orc extends Enemy{
    public Orc(int health) {
        super(health);
        super.damage = 8;
        type = "Orc";
    }
    @Override
    public void enemySuperPower(Hero hero){
        System.out.println("    " + type + " throws a gigantic stone at " + hero.getName());
        int num = (int) (Math.random() * 4);
        if (num == 2){
            System.out.println("\t\tSucceeded");
            hero.setHealth((hero.getHealth() - 25));
        }
    }
}
