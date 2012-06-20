
public class Demo {
    public static void main(String[] args) {
        Voicebox sharedVbox = new VoiceboxImpl();

        Client1 c1 = new Client1(sharedVbox);
        Client2 c2 = new Client2(sharedVbox);

        c2.checkMessagesFromClient1();
        c1.sayHelloToClient2();
        c2.checkMessagesFromClient1();

    }
}
