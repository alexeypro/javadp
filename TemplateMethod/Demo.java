public class Demo {
    public static void main(String[] args) {
        // it's a Latte shop
        Latte order = new WholeVanillaLatte();
        order.prepare();

        order = new FatfreeCaramelLatte();
        order.prepare();
    }
}
