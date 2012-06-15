public class ComputerImpl implements Computer {
    private final CPU cpu;
    private final RAM ram;
    public ComputerImpl(CPU cpu, RAM ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    @Override
    public void startComputer() {
        System.out.println("Starting computer...");
        this.cpu.freeze(10);
        this.cpu.jump(5);
        this.ram.check(100);
        this.ram.check(3);
        this.ram.activate();
        this.cpu.startup();
        System.out.println("Computer started!");
    }
}
