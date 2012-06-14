
public class Demo {
    public static void main(String[] args) {
        // we need to choose some strategy, I am client, and I think we want...
        Concator c = new ConcatorImpl();
        c.setStrategy(new ConcatUsingStringBufferImpl());
        System.out.println(c.concat("Hello", "World"));

        // nah, let's try another strategy
        c.setStrategy(new ConcatUsingStringImpl());
        System.out.println(c.concat("Hello", "World"));
    }
}
