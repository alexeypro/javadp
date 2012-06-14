public final class DoubleCheckLockingSingleton {
    private static volatile DoubleCheckLockingSingleton instance;
    private DoubleCheckLockingSingleton() {
        System.out.println("New Instance of DoubleCheckLockingSingleton!");
    }
    public static DoubleCheckLockingSingleton getInstance() {
        if (instance == null) {
            synchronized(DoubleCheckLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockingSingleton();
                }
            }
        }
        return instance;
    }
}
