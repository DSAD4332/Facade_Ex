package subsystems;


public class MechSystem {
    private boolean actionAvailable = true;

    public boolean canAct() {
        return actionAvailable;
    }

    public void performAction() {
        actionAvailable = false;
    }

    public void resetAction() {
        actionAvailable = true;
    }
}

