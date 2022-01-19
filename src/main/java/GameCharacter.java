public class GameCharacter {
    private String name;
    private int damage = 10;
    private int health;

    public GameCharacter(String name, int health) {
        setName(name);
        setHealth(health);
        setTakenDamage(damage);
        
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getHealth() {
        return health;
    }
    public void setTakenDamage( int damage) {
        this.damage = damage;
    } 
    public int getTakenDamage() {
        return damage;
    }
    public void takeDamage() {
        health = health-damage;
    }
}
