public abstract class Latte {

    public void getCup() {
        System.out.println("Getting New Cup");
    }
    public void addEspresso() {
        System.out.println("Adding Espresso");
    }
    public void giveCustomer() {
        System.out.println("Here is your Drink!");
        System.out.println();
    }

    public abstract void addSyrup();
    public abstract void addMilk();

    public void prepare() {
        this.getCup();
        this.addEspresso();
        this.addSyrup();
        this.addMilk();
        this.giveCustomer();
    }

}
