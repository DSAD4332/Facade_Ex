public class Main {
    public static void main(String[] args) {

        BattleFacade battle = new BattleFacade();

        battle.startBattleTurn();

        battle.moveMech("Combat Mech", 3, 4);

        battle.attackEnemy(
                "Combat Mech",
                "Hornet",
                2
        );

        battle.resolveEnemyPhase();
    }
}