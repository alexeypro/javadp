
public class Demo {
    public static void main(String[] args) {

        System.out.print("Look, I can speak English : ");
        English lang = new EnglishImpl();
        lang.sayHello();

        System.out.print("I also can speak Russian  : ");
        lang = new RussianToEnglishAdapter(new RussianImpl());
        lang.sayHello();

    }
}
