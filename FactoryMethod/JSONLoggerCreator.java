
public class JSONLoggerCreator extends AbstractLoggerCreator {
    @Override
    public Logger createLogger() {
        System.out.println("I am Factory Method of JSONLoggerCreator!");
        return new JSONLoggerImpl();
    }
}
