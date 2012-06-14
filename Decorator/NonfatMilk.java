public class NonfatMilk extends AbstractIngredient {
    private AbstractBeverage beverage;

    public NonfatMilk(AbstractBeverage bev) {
        this.beverage = bev;    // we need to know what exactly are we wrapping
    }

    @Override
    public double getCost() {
        return this.beverage.getCost() + 0.50;
    }

    @Override
    public String getName() {
        return this.beverage.getName() + ", Nonfat Milk";
    }

}
