
public class RussianToEnglishAdapter implements English {
    private final Russian adaptee;

    public RussianToEnglishAdapter(Russian adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void sayHello() {
        this.adaptee.skazhiPrivet();
    }
}
