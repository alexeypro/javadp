public class TwoPercentMilk extends AbstractIngredient {
    private AbstractBeverage beverage;

    public TwoPercentMilk(AbstractBeverage bev) {
        this.beverage = bev;    // we need to know what exactly are we wrapping
    }

    @Override
    public double getCost() {
        return this.beverage.getCost() + 0.40;
    }

    @Override
    public String getName() {
        return this.beverage.getName() + ", 2% Milk";
    }

}