
public class JSONLoggerCreator extends AbstractLoggerCreator {
    @Override
    public Logger createLogger() {
        return new JSONLoggerImpl();
    }
}
