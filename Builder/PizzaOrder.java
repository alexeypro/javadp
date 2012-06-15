public class PizzaOrder {
    // we want it to immutable
    private final int count;
    private final int slices;
    private final boolean pepperoni;
    private final boolean cheese;
    private final boolean sausages;
    private final boolean mozzarella;
    private final boolean mushrooms;

    public static class Builder {
        private final int count;    // required
        private boolean pepperoni;
        private boolean cheese;
        private boolean sausages;
        private boolean mozzarella;
        private boolean mushrooms;
        private int slices = 12;    // default is 12 slices
        public Builder(int count) {
            this.count = count;
        }
        public Builder addPepperoni() {
            this.pepperoni = true;
            return this;
        }
        public Builder addCheese() {
            this.cheese = true;
            return this;
        }
        public Builder addSausages() {
            this.sausages = true;
            return this;
        }
        public Builder addMozzarella() {
            this.mozzarella = true;
            return this;
        }
        public Builder addMushrooms() {
            this.mushrooms = true;
            return this;
        }
        public Builder cutInSlices(int slices) {
            this.slices = slices;
            return this;
        }
        public PizzaOrder build() {
            return new PizzaOrder(this.count, this.slices, this.pepperoni, this.cheese, this.sausages, this.mozzarella, this.mushrooms);
        }
    }
    private PizzaOrder(int count, int slices, boolean pepperoni, boolean cheese, boolean sausages, boolean mozzarella, boolean mushrooms) {
        this.count = count;
        this.slices = slices;
        this.pepperoni = pepperoni;
        this.cheese = cheese;
        this.sausages = sausages;
        this.mozzarella = mozzarella;
        this.mushrooms = mushrooms;
    }

    public void printOrder() {
        System.out.println("Pizza(s)    = " + this.count);
        System.out.println("Slices      = " + this.slices);
        System.out.println("Pepperoni   = " + (this.pepperoni ? "YES" : "NO"));
        System.out.println("Cheese      = " + (this.cheese ? "YES" : "NO"));
        System.out.println("Sausages    = " + (this.sausages ? "YES" : "NO"));
        System.out.println("Mozzarella  = " + (this.mozzarella ? "YES" : "NO"));
        System.out.println("Mushrooms   = " + (this.mushrooms ? "YES" : "NO"));
        System.out.println();
    }

}
