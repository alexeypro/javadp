public final class EagerInitSingleton {
    private final static EagerInitSingleton instance = new EagerInitSingleton();
    private EagerInitSingleton() {
        System.out.println("New Instance of EagerInitSingleton!");
    }
    public static EagerInitSingleton getInstance() {
        return EagerInitSingleton.instance;
    }
}
