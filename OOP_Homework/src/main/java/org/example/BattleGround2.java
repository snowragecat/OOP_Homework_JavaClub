package org.example;

import java.util.Scanner;

public class BattleGround2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Scanner inname = new Scanner(System.in);
        int h;
        Hero[] heroes = new Hero[3];
        for(int i = 0; i < heroes.length; i++) {
            System.out.println("Choose your hero: \n 1 - Warrior;   2 - Mage;   3 - Archer");
            h = in.nextInt();
            System.out.println("Choose a name for your hero:");
            String name = inname.nextLine();
            switch (h) {
                case 1:
                    heroes[i] = new Warrior(name);
                    break;
                case 2:
                    heroes[i] = new Mage(name);
                    break;
                case 3:
                    heroes[i] = new Archer(name);
                    break;
                default:
                    System.out.println("Invalid output so you automatically become a Warrior");
                    heroes[i] = new Warrior(name);
                    break;
                }
            }
        Enemy[] enemies = new Enemy[7];
        enemies[0] = new Orc(200);
        enemies[1] = new Zombie(100);
        enemies[2] = new Zombie(100);
        enemies[3] = new Orc(200);
        enemies[4] = new Zombie(100);
        enemies[5] = new Zombie(100);
        enemies[6] = new Orc(200);
        int countEnemy = 0;
        int countHeroes = 0;
        for (int i = 0;; i++){
            for (int j = countHeroes; j < heroes.length; j++) {
                heroes[j].attackEnemy(enemies[countEnemy]);
            }
            if (!enemies[countEnemy].isAlive()){
                System.out.println("Enemy " + enemies[countEnemy].getType() + " is dead!"); //\nHero health is: " + hero.getHealth());
                countEnemy++;
            }
            if (countEnemy == enemies.length){
                System.out.println("Heroes win! \nThere are no enemies left");
                break;
            }
            for (int j = countEnemy; j < enemies.length; j++) {
                enemies[j].attackHero(heroes[countHeroes]);
            }
            if (heroes[countHeroes].dead()){
                System.out.println("Hero " + heroes[countHeroes].getName() + " is dead!"); //\nHero health is: " + hero.getHealth());
                countHeroes++;
            }
            if (countHeroes == heroes.length){
                System.out.println("All heroes are dead((( \nGame over");
                break;
            }
            if (i%3 == 0){
                for (int j = countHeroes; j < heroes.length; j++) {
                    heroes[j].superPower(enemies[countEnemy]);
                }
            }
            if (!enemies[countEnemy].isAlive()){
                System.out.println("Enemy " + enemies[countEnemy].getType() + " is dead!"); //\nHero health is: " + hero.getHealth());
                countEnemy++;
            }
            if (countEnemy == enemies.length){
                System.out.println("Heroes win! \nThere are no enemies left");
                break;
            }
            if (i%5 == 0){
                for (int j = countEnemy; j < enemies.length; j++) {
                    enemies[j].enemySuperPower(heroes[countHeroes]);
                }
            }
            if (heroes[countHeroes].dead()){
                System.out.println("Hero " + heroes[countHeroes].getName() + " is dead!"); //\nHero health is: " + hero.getHealth());
                countHeroes++;
            }
            if (countHeroes == heroes.length){
                System.out.println("All heroes are dead((( \nGame over");
                break;
            }
            //System.out.println("Enemy health: " + enemies[i].getHealth());
        }
    }
}
