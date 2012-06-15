
public class Demo {
    public static void main(String[] args) {
        PizzaOrder order = new PizzaOrder.Builder(1).addCheese().addPepperoni().addMushrooms().cutInSlices(8).build();
        order.printOrder();

        order = new PizzaOrder.Builder(5).addMushrooms().addPepperoni().addMozzarella().build();
        order.printOrder();
    }
}
