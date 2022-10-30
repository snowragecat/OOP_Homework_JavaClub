package org.example;

public class Enemy implements Mortal{
    protected int health;
    protected int damage;
    protected String type = "";
    @Override
    public boolean isAlive() {
        if (health > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public Enemy(int health) {
        this.health = health;
        damage = 10;
        type = "Enemy";
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int takeDamage(int damage){
        return health-=damage;
    }
    public String getType() {
        return type;
    }
    public void attackHero(Hero hero){
        System.out.println(type + " is attacking Hero " + hero.getName());
        hero.setHealth((hero.getHealth() - damage));
    }
    public void enemySuperPower(Hero hero){
        System.out.println("    " + type + " is using enemySuperPower");
        attackHero(hero);
        attackHero(hero);
    }

}
interface  Mortal{
    boolean isAlive();
}