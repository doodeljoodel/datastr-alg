public class GameCharacter {
    private String player;
    private String enemy;
    private int damage=10;
    private int health=100;

    public GameCharacter(String player, int health) {
        this.player=player;
        
    }
    public String getGameCharacter() {
        return player;
    }
    public String getEnemyCharacter() {
        return enemy;
    }
    public int getHealth() {
        return health;
    }
    public int takeDamage() {
        return damage;
        
    }

}
