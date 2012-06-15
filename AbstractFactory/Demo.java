
public class Demo {
    public static void main(String[] args) {
        AbstractFactory aFactory = new AbstractFactory();

        AutoFactory f = aFactory.getAutoFactory(AbstractFactory.CarType.FERRARI);
        Car smallFerrari = f.getCar(AutoFactory.CarSize.SMALL);
        smallFerrari.honk();

        f = aFactory.getAutoFactory(AbstractFactory.CarType.MERCEDES);
        Car bigMercedes = f.getCar(AutoFactory.CarSize.LARGE);
        bigMercedes.honk();

    }
}
