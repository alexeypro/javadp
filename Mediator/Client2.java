
public class Client2 {
    private final Voicebox vb;
    public Client2(Voicebox v) {
        this.vb = v;
    }

    public void checkMessagesFromClient1() {
        System.out.println("Checking for messages to client2...");
        System.out.println("Client1 sent me  = " + this.vb.getMessage("client2"));
    }
}
