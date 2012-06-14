
public class Demo {

    public static class PlayButton implements Command {
        @Override
        public void execute() {
            System.out.println("Play movie button clicked");
        }
    }

    public static class RewindButton implements Command {
        @Override
        public void execute() {
            System.out.println("Rewind button clicked");
        }
    }

    public static void main(String[] args) {
        RemoteControl remote = new RemoteControlImpl();
        remote.clickButton();

        remote.programRemoteControl(new PlayButton());
        remote.clickButton();

        remote.programRemoteControl(new RewindButton());
        remote.clickButton();

    }
}
