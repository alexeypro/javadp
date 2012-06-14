public class CaramelSyrup extends AbstractIngredient {
    private AbstractBeverage beverage;

    public CaramelSyrup(AbstractBeverage bev) {
        this.beverage = bev;    // we need to know what exactly are we wrapping
    }

    @Override
    public double getCost() {
        return this.beverage.getCost() + 0.05;
    }

    @Override
    public String getName() {
        return this.beverage.getName() + ", Caramel";
    }

}