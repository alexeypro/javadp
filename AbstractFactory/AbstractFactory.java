
public class AbstractFactory {
    public static enum CarType { MERCEDES, FERRARI };

    public AutoFactory getAutoFactory(CarType type) {

        if (type == CarType.MERCEDES) {
            return new MercedesFactory();
        } else if (type == CarType.FERRARI) {
            return new FerrariFactory();
        }

        System.out.println("We don't manufacture such cars!");
        return null;
    }
}
