public class Main {

    public static void main(String[] args) {
         GameCharacter player = new GameCharacter("player", 100);
         GameCharacter enemy = new GameCharacter("ghoul",50);

         while (true) {
            System.out.println("A scary-looking Ghoul runs towards you. You decide to attack!");
            System.out.println(String.format("%s attacks %s for %d HP. %s has %d HP left", player.getGameCharacter(), enemy.getEnemyCharacter(), enemy.takeDamage(), enemy.getEnemyCharacter(), enemy.getHealth()));
            System.out.println(String.format("%s attacks %s for %d HP. %ps has %d HP left", enemy.getEnemyCharacter(), player.getGameCharacter(), enemy.takeDamage(), player.getGameCharacter(), enemy.getHealth()));
            
            if(enemy.getHealth() == 0) {
                System.out.println("The ghoul has been defeated");
            }
            break;

         }
    }
}
