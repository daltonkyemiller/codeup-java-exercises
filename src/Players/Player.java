package Players;

public class Player {
    private String name;
    private int health;
    private int strength;
    private int damageTaken;
    private int enemiesKilled;

    public Player() {
        this.name = "";
        this.health = 100;
        this.enemiesKilled = 0;
        this.damageTaken = 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void takeDamage(int damage) {
        this.damageTaken -= damage;
    }
}
