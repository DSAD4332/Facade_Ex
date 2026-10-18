package subsystems;

public class EnemySystem {
    public void takeDamage(String enemy, int damage) {
        System.out.println(
                enemy + " takes " + damage + " damage"
        );
    }
    public void pushEnemy(String enemy) {
        System.out.println(
                enemy + " is pushed to another tile"
        );
    }
}

