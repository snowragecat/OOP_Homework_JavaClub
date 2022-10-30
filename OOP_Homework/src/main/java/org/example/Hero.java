package org.example;

public abstract class Hero{
    protected String name;
    protected int health;
    public Hero(String name) {
        this.name = name;
        //this.health = 100;
    }
    public boolean dead(){
        if (health <= 0){
            return true;
        }
        else{
            return false;
        }
    }
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void superPower(Enemy enemy){
        attackEnemy(enemy);
    }
    public abstract void attackEnemy(Enemy enemy);
}
