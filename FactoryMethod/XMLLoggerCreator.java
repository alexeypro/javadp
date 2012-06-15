
public class XMLLoggerCreator extends AbstractLoggerCreator {
    @Override
    public Logger createLogger() {
        return new XMLLoggerImpl();
    }
}
