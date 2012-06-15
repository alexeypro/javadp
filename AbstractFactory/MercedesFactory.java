
public class MercedesFactory implements AutoFactory {
    @Override
    public Car getCar(CarSize size) {
        System.out.println("Making luxury Mercedes now...");
        if (size == CarSize.SMALL) {
            return new MercedesC300();
        } else if (size == CarSize.LARGE) {
            return new MercedesS600();
        }
        System.out.println("Unfortunately we don't have such cars at our Mercedes factory...");
        return null;
    }
}
