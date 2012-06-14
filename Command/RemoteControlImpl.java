
public class RemoteControlImpl implements RemoteControl {
    private Command cmd;

    public RemoteControlImpl() {

    }

    // just a convenience constructor
    public RemoteControlImpl(Command cmd) {
        this.programRemoteControl(cmd);
    }

    @Override
    public void programRemoteControl(Command cmd) {
        this.cmd = cmd;
    }

    @Override
    public void clickButton() {
        if (this.cmd == null) {
            System.out.println("You need to program this remote control first using programRemoteControl(Command) method.");
        } else {
            this.cmd.execute();
        }
    }
}
