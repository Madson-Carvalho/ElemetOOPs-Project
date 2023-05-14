package Creatures;

public abstract class Creature {
    private int power;
    private int attack;
    private int defense;
    private int speed;
    private int lifePoints;
    private CreatureName creatureName;

    public Creature() {
        setPower(this.power);
        setAttack(this.attack);
        setDefense(this.defense);
        setSpeed(this.speed);
        setLifePoints(this.lifePoints);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public CreatureName getCreatureName() {
        return creatureName;
    }

    public void setCreatureName(CreatureName creatureName) {
        this.creatureName = creatureName;
    }

    public void physicalAttack(Creature enemy) {
        System.out.println("\n" + getCreatureName());
        System.out.println("Ataque físico...");
        int damage = (getPower() * getAttack()) / enemy.getDefense();
        enemy.receiveDamage(damage);
        showStatusAfterAttack(damage, enemy);
    }

    public abstract void elementalAttack(Creature oponent);

    public void receiveDamage(int damage) {
        setLifePoints(getLifePoints() - damage);
    }

    public void showStatusAfterAttack(int damage, Creature enemy) {
        System.out.printf("Dano aplicado: %d\n", damage);
        int enemyLife = enemy.getLifePoints() <= 0 ? 0 : enemy.getLifePoints();
        System.out.printf("Vida do inimigo: %d\n", enemyLife);
    }
}
