import java.util.Random;

public class GameMachineImpl implements GameMachine {
    private State currentState = new LooserImpl();  // default state is "nobody wins"
    private boolean quarterInMachine = false;       // by default machine has no quarter in it

    @Override
    public void insertQuarter() {
        this.quarterInMachine = true;
    }

    @Override
    public void play() {
        if (this.quarterInMachine) {
            this.quarterInMachine = false;
            Random rand = new Random();
            if ((rand.nextInt() % 2) == 0) {
                this.currentState = new LooserImpl();
            } else {
                this.currentState = new WinnerImpl();
            }
            System.out.println(this.currentState.getResult());
        } else {
            System.out.println("Please put the quarter into machine first!");
        }
    }
}
