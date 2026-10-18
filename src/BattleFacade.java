import subsystems.*;

public class BattleFacade {

    private final GridSystem grid;
    private final MechSystem mechSystem;
    private final WeaponSystem weaponSystem;
    private final EnemySystem enemySystem;
    private final TurnSystem turnSystem;

    public BattleFacade() {
        grid = new GridSystem();
        mechSystem = new MechSystem();
        weaponSystem = new WeaponSystem();
        enemySystem = new EnemySystem();
        turnSystem = new TurnSystem();
    }

    public void startBattleTurn() {
        turnSystem.startPlayerTurn();
        mechSystem.resetAction();
    }

    public void moveMech(String mech, int x, int y) {
        if (!grid.isWalkable(x, y)) {
            System.out.println("Invalid movement!");
            return;
        }

        grid.moveMech(mech, x, y);
    }

    public void attackEnemy(
            String mech,
            String enemy,
            int damage
    ) {
        if (!mechSystem.canAct()) {
            System.out.println(
                    "This mech has already used its action!"
            );
            return;
        }

        weaponSystem.fire(mech, enemy);
        enemySystem.takeDamage(enemy, damage);
        enemySystem.pushEnemy(enemy);

        mechSystem.performAction();
    }

    public void resolveEnemyPhase() {
        turnSystem.endPlayerTurn();
        turnSystem.executeEnemyTurn();
    }
}