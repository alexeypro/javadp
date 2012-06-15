
public interface AutoFactory {
    public static enum CarSize { SMALL, LARGE };
    public Car getCar(CarSize size);
}
