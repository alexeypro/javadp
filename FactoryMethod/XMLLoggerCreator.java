
public class XMLLoggerCreator extends AbstractLoggerCreator {
    @Override
    public Logger createLogger() {
        System.out.println("I am Factory Method of XMLLoggerCreator!");
        return new XMLLoggerImpl();
    }
}
