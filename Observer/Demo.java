public class Demo {

    public static class Waitress implements Observer {
        private final String name;

        public Waitress(String name) {
            this.name = name;
        }

        @Override
        public void update() {
            System.out.println("I am waitress " + this.name + ", and now I know my meal is ready!");
        }
    }

    public static class Chef extends SubjectImpl {
        // just using default implementation
        public Chef() {
            System.out.println("New Chef in the house!");
        }
    }
    
    public static void main(String[] args) {
        Subject chef = new Chef();
        System.out.println("Adding two new waitresses to help this chef...");
        chef.addObserver(new Waitress("Helen"));
        chef.addObserver(new Waitress("Joanne"));
        // cooking here...
        chef.notifyObservers();
    }
}