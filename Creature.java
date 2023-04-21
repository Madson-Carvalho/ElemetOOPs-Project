public class Creature {
    private int power;
    private int attack;
    private int defense;
    private int speed;
    private int lifePoints;

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
}
