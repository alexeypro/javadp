
public class Demo {
    public static void main(String[] args) {
        Computer facade = new ComputerImpl(new CPU(), new RAM());
        facade.startComputer();
    }
}
