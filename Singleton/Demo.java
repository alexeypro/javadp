public class Demo {
    public static void main(String[] args) {
        // you'll see only one occurrence of singleton creation

        DoubleCheckLockingSingleton dcls = DoubleCheckLockingSingleton.getInstance();
        dcls = DoubleCheckLockingSingleton.getInstance();
        dcls = DoubleCheckLockingSingleton.getInstance();
        dcls = DoubleCheckLockingSingleton.getInstance();
        dcls = DoubleCheckLockingSingleton.getInstance();

        EagerInitSingleton eis = EagerInitSingleton.getInstance();
        eis = EagerInitSingleton.getInstance();
        eis = EagerInitSingleton.getInstance();
        eis = EagerInitSingleton.getInstance();
        eis = EagerInitSingleton.getInstance();
    }
}
