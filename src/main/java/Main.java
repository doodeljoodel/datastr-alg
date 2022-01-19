public class Main {

    public static void main(String[] args) {
        System.out.println("A scary-looking Ghoul runs towards you. You decide to attack!");

        GameCharacter player = new GameCharacter("player", 100);
        GameCharacter enemy = new GameCharacter("ghoul",50);

         while (true) {
            enemy.takeDamage();
            System.out.println(String.format("%s attacks %s for %d HP. %s has %d HP left", 
            player.getName(), enemy.getName(), enemy.getTakenDamage(), enemy.getName(), enemy.getHealth()));

            player.takeDamage();
            System.out.println(String.format("%s attacks %s for %d HP. %s has %d HP left", 
            enemy.getName(), player.getName(), enemy.getTakenDamage(), player.getName(), enemy.getHealth()));
            
            if(enemy.getHealth() == 0) {
                System.out.println("The ghoul has been defeated");
                break;
            }
            

         }
    }
}
