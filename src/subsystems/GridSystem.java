package subsystems;

public class GridSystem {
    public boolean isWalkable(int x, int y) {
        return x >= 0 && x < 8
                && y >= 0 && y < 8;
    }

    public void moveMech(String mech, int x, int y) {
        System.out.println(
                mech + " moves to (" + x + ", " + y + ")"
        );
    }
}

