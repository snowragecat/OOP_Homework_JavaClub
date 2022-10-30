package org.example;

import java.util.Scanner;

public class BattleGround {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Scanner inname = new Scanner(System.in);
        Hero hero;
        System.out.println("Choose your hero: \n 1 - Warrior;   2 - Mage;   3 - Archer");
        int h = in.nextInt();
        System.out.println("Choose a name for your hero:");
        String name = inname.nextLine();
        switch (h) {
            case 1: hero = new Warrior(name);
                break;
            case 2: hero = new Mage(name);
                break;
            case 3: hero = new Archer(name);
                break;
            default:
                System.out.println("Invalid output so you automatically become a Warrior");
                hero = new Warrior(name);
                break;
        }
        /*Enemy e1;
        e1 = new Orc(200);
        Enemy e2;
        e2 = new Zombie(100);
        Enemy e3;
        e3 = new Zombie(100);*/
        Enemy[] enemies = new Enemy[3];
        enemies[0] = new Orc(200);
        enemies[1] = new Zombie(100);
        enemies[2] = new Zombie(100);

        int count = 0;
        for (int i = 0;; i++){
            hero.attackEnemy(enemies[count]);
            for (int j = count; j < enemies.length; j++) {
                enemies[j].attackHero(hero);
            }
            if (i%3 == 0){
                hero.superPower(enemies[count]);
            }
            if (i%5 == 0){
                for (int j = count; j < enemies.length; j++) {
                    enemies[j].enemySuperPower(hero);
                }
            }
            if (!enemies[count].isAlive()){
                System.out.println("Enemy " + enemies[count].getType() + " is dead! \nHero health is: " + hero.getHealth());
                count++;
            }
            if (count == enemies.length){
                System.out.println("Hero wins! \nThere are no enemies left");
                break;
            }
            if (hero.dead()){
                System.out.println("Your hero is dead((( \nGame over");
            }
            //System.out.println("Enemy health: " + enemies[i].getHealth());
        }


        /*while (){
            hero.attackEnemy(enemy);
            System.out.println("Enemy health: " + enemy.getHealth());
            if (!enemy.isAlive()){
                System.out.println("Enemy is dead, hero won!");
                break;
            }
        }*/





    }
}
