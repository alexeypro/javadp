public class Demo {
    public static void main(String[] args) {
        AbstractBeverage bev = new CaramelSyrup(new NonfatMilk(new IllyEspresso()));
        System.out.println("Beverage #1 - " + bev.toString());

        bev = new CaramelSyrup(new HazelnutSyrup(new TwoPercentMilk(new LavazzaEspresso())));
        System.out.println("Beverage #2 - " + bev.toString());

    }
}
