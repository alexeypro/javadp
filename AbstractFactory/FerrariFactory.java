
public class FerrariFactory implements AutoFactory {
    @Override
    public Car getCar(CarSize size) {
        System.out.println("Making fast Ferrari now...");
        if (size == CarSize.SMALL) {
            return new Ferrari149();
        } else if (size == CarSize.LARGE) {
            return new Ferrari550();
        }
        System.out.println("Unfortunately we don't have such cars at our Ferrari factory...");
        return null;
    }
}
