
public class Client1 {
    private final Voicebox vm;

    public Client1(Voicebox v) {
        this.vm = v;
    }

    public void sayHelloToClient2() {
        System.out.println("Sending a message to client2...");
        this.vm.leaveMessage("client2", "hello world!");
    }
}
