public abstract class AbstractBeverage {
    protected String name = "Unknown Beverage";

    public abstract double getCost();

    public String getName() {
        return this.name;
    }

    public String toString() {
            return this.getName() + " = $" + this.getCost();
    }
}
